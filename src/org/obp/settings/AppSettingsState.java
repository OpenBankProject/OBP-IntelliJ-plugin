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

    public void setSecret1(String secret1) {
        this.secret1 = secret1;
    }

    public void setSecret2(String secret2) {
        this.secret2 = secret2;
    }

    public void setSecret3(String secret3) {
        this.secret3 = secret3;
    }

    public void setSecret4(String secret4) {
        this.secret4 = secret4;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getHostVersion() {
        return hostVersion;
    }

    public void setHostVersion(String hostVersion) {
        this.hostVersion = hostVersion;
    }



    private String hostVersion=new String();

    private  String host1 = new String();
    private  String host2 = new String();
    private  String host3 = new String();
    private  String host4 = new String();

    private  String consumerKey1 = new String();
    private  String consumerKey2 = new String();
    private  String consumerKey3 = new String();
    private  String consumerKey4 = new String();


    private  String secret1 = new String();
    private  String secret2 = new String();
    private  String secret3 = new String();
    private  String secret4 = new String();

    private  String login = new String();
    private  String password = new String();


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

    public String getSecret1() {
        return secret1;
    }

    public String getSecret2() {
        return secret2;
    }

    public String getSecret3() {
        return secret3;
    }

    public String getSecret4() {
        return secret4;
    }

    public String getLogin() {
        return login;
    }


    public String getPassword() {
        return password;
    }
    
}
