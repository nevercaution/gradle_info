package com.nevercaution.gradle_info.controller;

import com.nevercaution.gradle_info.service.ExtensionInfoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainClass {

    @GetMapping(value = "/main")
    public String main() {

        return ExtensionInfoUtil.getInstance().getProjectName() + ", version : " + ExtensionInfoUtil.getInstance().getAppVersion();
    }
}
