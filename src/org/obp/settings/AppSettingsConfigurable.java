// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.obp.settings;

import com.intellij.openapi.options.Configurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Provides controller functionality for application settings.
 */
public class AppSettingsConfigurable implements Configurable {

    private AppSettingsComponent mySettingsComponent;

    // A default constructor with no arguments is required because this implementation
    // is registered as an applicationConfigurable EP

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "OBP-IntelliJ-plugin: Open Bank Project";
    }

    @Override
    public JComponent getPreferredFocusedComponent() {
        return mySettingsComponent.getPreferredFocusedComponent();
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        mySettingsComponent = new AppSettingsComponent();
        return mySettingsComponent.getPanel();
    }

    @Override
    public boolean isModified() {
        AppSettingsState settings = AppSettingsState.getInstance();
        boolean modified = !(mySettingsComponent.getConsumer1Text().equals(settings.getConsumerKey1())
                && mySettingsComponent.getConsumer2Text().equals(settings.getConsumerKey2())
                && mySettingsComponent.getConsumer3Text().equals(settings.getConsumerKey3())
                && mySettingsComponent.getConsumer4Text().equals(settings.getConsumerKey4())
                && mySettingsComponent.getHost1Text().equals(settings.getHost1())
                && mySettingsComponent.getHost2Text().equals(settings.getHost2())
                && mySettingsComponent.getHost3Text().equals(settings.getHost3())
                && mySettingsComponent.getHost4Text().equals(settings.getHost4())
                && mySettingsComponent.getSecret1Text().equals(settings.getSecret1())
                && mySettingsComponent.getSecret2Text().equals(settings.getSecret2())
                && mySettingsComponent.getSecret3Text().equals(settings.getSecret3())
                && mySettingsComponent.getSecret4Text().equals(settings.getSecret4())
                && mySettingsComponent.getHostVersion().equals(settings.getHostVersion())
                && mySettingsComponent.getLogin().equals(settings.getLogin())
                && mySettingsComponent.getPassword().equals(settings.getPassword())


        );


        return modified;
    }

    @Override
    public void apply() {
        AppSettingsState settings = AppSettingsState.getInstance();

        settings.setHost1(mySettingsComponent.getHost1Text());
        settings.setHost2(mySettingsComponent.getHost2Text());
        settings.setHost3(mySettingsComponent.getHost3Text());
        settings.setHost4(mySettingsComponent.getHost4Text());

        settings.setConsumerKey1(mySettingsComponent.getConsumer1Text());
        settings.setConsumerKey2(mySettingsComponent.getConsumer2Text());
        settings.setConsumerKey3(mySettingsComponent.getConsumer3Text());
        settings.setConsumerKey4(mySettingsComponent.getConsumer4Text());

        settings.setSecret1(mySettingsComponent.getSecret1Text());
        settings.setSecret2(mySettingsComponent.getSecret2Text());
        settings.setSecret3(mySettingsComponent.getSecret3Text());
        settings.setSecret4(mySettingsComponent.getSecret4Text());
        settings.setHostVersion(mySettingsComponent.getHostVersion());
        settings.setLogin(mySettingsComponent.getLogin());
        settings.setPassword(mySettingsComponent.getPassword());
    }

    @Override
    public void reset() {
        AppSettingsState settings = AppSettingsState.getInstance();
        mySettingsComponent.setHost1(settings.getHost1());
        mySettingsComponent.setHost2(settings.getHost2());
        mySettingsComponent.setHost3(settings.getHost3());
        mySettingsComponent.setHost4(settings.getHost4());

        mySettingsComponent.setConsumerKey1(settings.getConsumerKey1());
        mySettingsComponent.setConsumerKey2(settings.getConsumerKey2());
        mySettingsComponent.setConsumerKey3(settings.getConsumerKey3());
        mySettingsComponent.setConsumerKey4(settings.getConsumerKey4());

        mySettingsComponent.setSecret1(settings.getSecret1());
        mySettingsComponent.setSecret2(settings.getSecret2());
        mySettingsComponent.setSecret3(settings.getSecret3());
        mySettingsComponent.setSecret4(settings.getSecret4());

        mySettingsComponent.setLogin(settings.getLogin());
        mySettingsComponent.setPassword(settings.getPassword());
        mySettingsComponent.setHostVersion(settings.getHostVersion());


    }

    @Override
    public void disposeUIResources() {
        mySettingsComponent = null;
    }

}
