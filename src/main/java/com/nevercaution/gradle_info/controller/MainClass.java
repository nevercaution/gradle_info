package com.nevercaution.gradle_info.controller;

import com.nevercaution.gradle_info.service.ExtInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainClass {

    private ExtInfoService extInfoService;

    @Autowired
    public MainClass(ExtInfoService extInfoService) {
        this.extInfoService = extInfoService;
    }

    @GetMapping(value = "/main")
    public String main() {

        return extInfoService.getProjectName() + ", version : " + extInfoService.getAppVersion();
    }
}
