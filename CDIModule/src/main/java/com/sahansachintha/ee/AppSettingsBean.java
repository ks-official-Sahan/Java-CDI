package com.sahansachintha.ee;

import com.sahansachintha.ee.cdi.MyService;
import com.sahansachintha.ee.remote.AppSettings;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.io.Serializable;

@Stateless
public class AppSettingsBean implements AppSettings, Serializable {
    @Inject
    private MyService myService;

    @Override
    public String getAppName() {
        myService.doSomething();
        return "CDI Module";
    }

    @Override
    public String getAppVersion() {
        return "1.0.0";
    }

    @Override
    public String getAppDescription() {
        return "This is the CDI Module Application Settings";
    }
}
