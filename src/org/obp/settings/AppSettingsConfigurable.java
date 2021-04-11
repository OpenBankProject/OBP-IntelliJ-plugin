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



    @Nullable
    @Override
    public JComponent createComponent() {
        mySettingsComponent = new AppSettingsComponent();
        return mySettingsComponent.getPanel();
    }

    @Override
    public boolean isModified() {
        AppSettingsState settings = AppSettingsState.getInstance();
        boolean modified = !(
                mySettingsComponent.getConsumer1Text().equals(settings.getConsumerKey1())
                        && mySettingsComponent.getConsumer2Text().equals(settings.getConsumerKey2())
                        && mySettingsComponent.getConsumer3Text().equals(settings.getConsumerKey3())
                        && mySettingsComponent.getConsumer4Text().equals(settings.getConsumerKey4())
                        && mySettingsComponent.getHost1Text().equals(settings.getHost1())
                        && mySettingsComponent.getHost2Text().equals(settings.getHost2())
                        && mySettingsComponent.getHost3Text().equals(settings.getHost3())
                        && mySettingsComponent.getHost4Text().equals(settings.getHost4())
                        && mySettingsComponent.getLogin1().equals(settings.getLogin1())
                        && mySettingsComponent.getLogin2().equals(settings.getLogin2())
                        && mySettingsComponent.getLogin3().equals(settings.getLogin3())
                        && mySettingsComponent.getLogin4().equals(settings.getLogin4())
                        && mySettingsComponent.getPassword1().equals(settings.getPassword1())
                        && mySettingsComponent.getPassword2().equals(settings.getPassword2())
                        && mySettingsComponent.getPassword3().equals(settings.getPassword3())
                        && mySettingsComponent.getPassword4().equals(settings.getPassword4())
                        && mySettingsComponent.getHostVersion().equals(settings.getHostVersion())


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

        settings.setLogin1(mySettingsComponent.getLogin1());
        settings.setLogin2(mySettingsComponent.getLogin2());
        settings.setLogin3(mySettingsComponent.getLogin3());
        settings.setLogin4(mySettingsComponent.getLogin4());

        settings.setPassword1(mySettingsComponent.getPassword1());
        settings.setPassword2(mySettingsComponent.getPassword2());
        settings.setPassword3(mySettingsComponent.getPassword3());
        settings.setPassword4(mySettingsComponent.getPassword4());

        settings.setHostVersion(mySettingsComponent.getHostVersion());
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

        mySettingsComponent.setLogin1(settings.getLogin1());
        mySettingsComponent.setLogin2(settings.getLogin2());
        mySettingsComponent.setLogin3(settings.getLogin3());
        mySettingsComponent.setLogin4(settings.getLogin4());

        mySettingsComponent.setPassword1(settings.getPassword1());
        mySettingsComponent.setPassword2(settings.getPassword2());
        mySettingsComponent.setPassword3(settings.getPassword3());
        mySettingsComponent.setPassword4(settings.getPassword4());


        mySettingsComponent.setHostVersion(settings.getHostVersion());


    }

    @Override
    public void disposeUIResources() {
        mySettingsComponent = null;
    }

}
