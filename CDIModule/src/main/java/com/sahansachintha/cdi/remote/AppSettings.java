package com.sahansachintha.cdi.remote;

import jakarta.ejb.Remote;

@Remote
public interface AppSettings {
    String getAppName();
    String getAppVersion();
    String getAppDescription();
}
