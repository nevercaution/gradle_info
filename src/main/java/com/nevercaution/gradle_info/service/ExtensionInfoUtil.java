package com.nevercaution.gradle_info.service;

public class ExtensionInfoUtil {

    private String appVersion;
    private String projectName;

    private ExtensionInfoUtil() {
        this.appVersion = "";
        this.projectName = "";
    }
    public static ExtensionInfoUtil getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final ExtensionInfoUtil INSTANCE = new ExtensionInfoUtil();
    }

    public void setInfo(String appVersion, String projectName) {
        this.appVersion = appVersion;
        this.projectName = projectName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public String getProjectName() {
        return projectName;
    }
}
