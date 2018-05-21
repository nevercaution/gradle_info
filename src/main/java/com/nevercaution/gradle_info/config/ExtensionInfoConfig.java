package com.nevercaution.gradle_info.config;

import com.nevercaution.gradle_info.service.ExtensionInfoUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExtensionInfoConfig {
    @Value("${ext.project_name}")
    private String projectNameFirst;

    @Value("${ext.app_version}")
    private String appVersionFirst;

    @Bean
    public ExtensionInfoUtil loader() {

        final String projectName = makeItem(projectNameFirst);
        final String appVersion = makeItem(appVersionFirst);

        ExtensionInfoUtil.getInstance().setInfo(appVersion, projectName);

        return ExtensionInfoUtil.getInstance();
    }

    private String makeItem(final String item) {
        if (item == null || item.contains("$")) {
            return "default";
        }
        return item.split(":")[0];
    }
}
