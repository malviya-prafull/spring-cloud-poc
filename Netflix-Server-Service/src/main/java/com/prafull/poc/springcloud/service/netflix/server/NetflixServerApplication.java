package com.prafull.poc.springcloud.service.netflix.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixServerApplication.class, args);
    }
}
