package com.catalina.remote.config.demo.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dynamic")
@RefreshScope
public class CalcEndpoint {

    private final String testProperty;

    public CalcEndpoint(@Value("${test.property}") String testProperty) {
        this.testProperty = testProperty;
    }

    @GetMapping("/result")
    public String result() {
        return testProperty;
    }
}
