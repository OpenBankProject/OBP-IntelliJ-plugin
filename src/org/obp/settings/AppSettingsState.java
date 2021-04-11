// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.obp.settings;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
    private String hostVersion = new String();
    private String login1=new String();
    private String login2=new String();
    private String login3=new String();
    private String login4=new String();

    private String host1 = new String();
    private String host2 = new String();
    private String host3 = new String();
    private String host4 = new String();

    private String consumerKey1 = new String();
    private String consumerKey2 = new String();
    private String consumerKey3 = new String();
    private String consumerKey4 = new String();


    private String password1 = new String();
    private String password2 = new String();
    private String password3 = new String();
    private String password4 = new String();


    public void setHost1(String host1) {
        this.host1 = host1;
    }

    public void setHost2(String host2) {
        this.host2 = host2;
    }

    public void setHost3(String host3) {
        this.host3 = host3;
    }

    public void setHost4(String host4) {
        this.host4 = host4;
    }

    public void setConsumerKey1(String consumerKey1) {
        this.consumerKey1 = consumerKey1;
    }

    public void setConsumerKey2(String consumerKey2) {
        this.consumerKey2 = consumerKey2;
    }

    public void setConsumerKey3(String consumerKey3) {
        this.consumerKey3 = consumerKey3;
    }

    public void setConsumerKey4(String consumerKey4) {
        this.consumerKey4 = consumerKey4;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public void setPassword3(String password3) {
        this.password3 = password3;
    }

    public void setPassword4(String password4) {
        this.password4 = password4;
    }




    public String getHostVersion() {
        return hostVersion;
    }

    public void setHostVersion(String hostVersion) {
        this.hostVersion = hostVersion;
    }





    public static AppSettingsState getInstance() {
        return ServiceManager.getService(AppSettingsState.class);
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

    public String getHost1() {
        return host1;
    }

    public String getHost2() {
        return host2;
    }

    public String getHost3() {
        return host3;
    }

    public String getHost4() {
        return host4;
    }

    public String getConsumerKey1() {
        return consumerKey1;
    }

    public String getConsumerKey2() {
        return consumerKey2;
    }

    public String getConsumerKey3() {
        return consumerKey3;
    }

    public String getConsumerKey4() {
        return consumerKey4;
    }

    public String getPassword1() {
        return password1;
    }

    public String getPassword2() {
        return password2;
    }

    public String getPassword3() {
        return password3;
    }

    public String getPassword4() {
        return password4;
    }

    public String getLogin1() {
        return login1;
    }
    public String getLogin2() {
        return login2;
    }
    public String getLogin3() {
        return login3;
    }
    public String getLogin4() {
        return login4;
    }


    public ModelParams getModelParams() {
        String host;
        String login;
        String password;
        String consumerKey;

        if (hostVersion.equals("Host1")) {
            host = host1;
            login = login1;
            password = password1;
            consumerKey = consumerKey1;
        } else if (hostVersion.equals("Host2")) {
            host = host2;
            login = login2;
            password = password2;
            consumerKey = consumerKey2;
        } else if (hostVersion.equals("Host3")) {
            host = host3;
            login = login3;
            password = password3;
            consumerKey = consumerKey3;
        } else {
            host = host4;
            login = login4;
            password = password4;
            consumerKey = consumerKey4;
        }


        return new ModelParams(host, consumerKey, login, password);

    }

    public void setLogin1(String l) {
        this.login1=l;
    }
    public void setLogin2(String l) {
        this.login2=l;
    }
    public void setLogin3(String l) {
        this.login3=l;
    }
    public void setLogin4(String l) {
        this.login4=l;
    }
}
