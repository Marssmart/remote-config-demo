package com.catalina.remote.config.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.mongodb.EnableMongoConfigServer;

@SpringBootApplication
@EnableMongoConfigServer
public class RemoteConfigDemo {

    public static void main(String[] args) {
        SpringApplication.run(RemoteConfigDemo.class, args);
    }
}
