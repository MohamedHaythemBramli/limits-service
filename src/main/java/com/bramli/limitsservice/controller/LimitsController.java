package com.bramli.limitsservice.controller;

import com.bramli.limitsservice.bean.Limits;
import com.bramli.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configuration config;
    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(config.getMinimum(),config.getMaximum());
    //return new Limits(1,1000);
    }
}
