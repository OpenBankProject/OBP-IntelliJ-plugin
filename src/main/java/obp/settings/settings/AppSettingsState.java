// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package obp.settings.settings;

import com.intellij.credentialStore.CredentialAttributes;
import com.intellij.credentialStore.CredentialAttributesKt;
import com.intellij.credentialStore.Credentials;
import com.intellij.ide.passwordSafe.PasswordSafe;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Supports storing the application settings in a persistent way.
 * The {@link State} and {@link Storage} annotations define the name of the data and the file name where
 * these persistent application settings are stored.
 */
@State(
        name = "org.intellij.sdk.settings.AppSettingsState",
        storages = {@Storage("SdkSettingsPlugin.xml")}
)
public class AppSettingsState implements PersistentStateComponent<AppSettingsState> {

    public static class ModelParams {
        String id;
        String host;
        String consumerKey;

        String log;
        String pas;

        private ModelParams() {
        }

         private ModelParams(String id,String host, String consumerKey, String log, String pas) {
            this.id=id;
            this.host = host;
            this.consumerKey = consumerKey;

            this.log = log;
            this.pas = pas;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getHost() {
            return host;
        }

        public String getConsumerKey() {
            return consumerKey;
        }


        public String getLog() {
            return log;
        }

        public String getPas() {
            return pas;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public void setConsumerKey(String consumerKey) {
            this.consumerKey = consumerKey;
        }

        public void setLog(String log) {
            this.log = log;
        }

        public void setPas(String pas) {
            this.pas = pas;
        }

        public AppSettingsState.ModelParams copy() {
            return new AppSettingsState.ModelParams(id,host,consumerKey, log, pas);
        }
    }

    public Integer hostVersion = new Integer(0);
    public static Integer maxNumber = new Integer(0);
    public List<String> modelParamIDs = new ArrayList<>();


    private List<AppSettingsState.ModelParams> modelParamsList = new ArrayList<>();

    public List<ModelParams> getModelParamList() {
       return modelParamIDs.stream().map(id -> retrieveModelParams(id)).collect(Collectors.toList());
    }

    public static AppSettingsState.ModelParams createModelParams(String host, String consumerKey, String log, String pas){
        maxNumber++;
        return new AppSettingsState.ModelParams(""+maxNumber,host, consumerKey,log, pas);
    }



    public void setModelParamList(List<AppSettingsState.ModelParams> newModel) {
        this.modelParamsList = (newModel != null) ?
                newModel.stream().map(p -> p.copy()).collect(Collectors.toList()) :
                new ArrayList<>();
        modelParamIDs = this.modelParamsList.stream().map(mp -> {
            storeModelParams(mp);
            return mp.getId();
        }).collect(Collectors.toList());

    }

    public Integer getHostVersion() {
        return hostVersion;
    }

    public void setHostVersion(Integer hostVersion) {
        this.hostVersion = hostVersion;
    }


    public static AppSettingsState getInstance() {
        return ServiceManager.getService(AppSettingsState.class);
    }

    private static CredentialAttributes createCredentialAttributes(String key) {
        return new CredentialAttributes(CredentialAttributesKt.generateServiceName("MySystem", key));
    }

    private String retrieveCredentials(String key) {
        CredentialAttributes credentialAttributes = createCredentialAttributes(key);

        Credentials credentials = PasswordSafe.getInstance().get(credentialAttributes);
        if (credentials != null) {
            return credentials.getPasswordAsString();
        }
        return null;
    }

    private static void storeCredentials(String credentialsName, String username, String password) {
        CredentialAttributes credentialAttributes = createCredentialAttributes(credentialsName);
        Credentials credentials = new Credentials(username, password);
        PasswordSafe.getInstance().set(credentialAttributes, credentials);
    }

    private static void storeModelParams(ModelParams modelParams) {
        String id = modelParams.getId();
        String consumerKey = modelParams.getConsumerKey();
        String host = modelParams.getHost();
        String log = modelParams.getLog();
        String pas = modelParams.getPas();
        storeField(id, "consumerKey", consumerKey);
        storeField(id, "host", host);
        storeField(id, "log", log);
        storeField(id, "pas", pas);
    }

    public static void removeModelParams(ModelParams modelParams) {
        String id = modelParams.getId();

        storeCredentials(createCredentialsName(id, "consumerKey"), null, null);
        storeCredentials(createCredentialsName(id, "host"), null, null);
        storeCredentials(createCredentialsName(id, "log"), null, null);
        storeCredentials(createCredentialsName(id, "pas"), null, null);

    }


    private ModelParams retrieveModelParams(String modelParamsID) {
        String consumerKey = retrieveCredentials(createCredentialsName(modelParamsID,"consumerKey"));
        String host = retrieveCredentials(createCredentialsName(modelParamsID,"host"));
        String log = retrieveCredentials(createCredentialsName(modelParamsID,"log"));
        String pas = retrieveCredentials(createCredentialsName(modelParamsID,"pas"));;

        return new ModelParams(modelParamsID, host, consumerKey, log, pas);

    }

    private static void storeField(String id, String fieldName, String fieldValue) {
        storeCredentials(createCredentialsName(id, fieldName), null, null);
        storeCredentials(createCredentialsName(id, fieldName), fieldValue, fieldValue);
    }

    @NotNull
    private static String createCredentialsName(String id, String fieldName) {
        return "id_" + id + "_" + fieldName;
    }

    @Nullable
    @Override
    public AppSettingsState getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull AppSettingsState state) {
        XmlSerializerUtil.copyBean(state, this);
    }


    public ModelParams getModelParams() {

        return modelParamsList.size() > 0 && modelParamIDs.size() > hostVersion.intValue() ?
                modelParamsList.get(hostVersion.intValue()) : new ModelParams();

    }

}
