// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.obp.settings;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

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
    private Integer hostVersion = new Integer(0);
    private List<ModelParams> modelParamsList=new ArrayList<>();


    public List<ModelParams> getModelParamsList() { 
        return modelParamsList;
    }

    public void setModelParamsList(List<ModelParams> modelParamsList) {
        this.modelParamsList = modelParamsList;
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
       return modelParamsList.get(hostVersion.intValue());

    }

}
