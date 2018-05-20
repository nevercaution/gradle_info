package com.nevercaution.gradle_info.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ExtInfoService {

    @Value("${ext.appVersion}")
    private String appVersion;

    @Value("${ext.projectName}")
    private String projectName;

    public String getAppVersion() {
        return appVersion;
    }

    public String getProjectName() {
        return projectName;
    }
}
