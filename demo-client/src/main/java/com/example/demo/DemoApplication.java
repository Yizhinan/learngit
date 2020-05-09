package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("DemoApplication.class");
        SpringApplication.run(DemoApplication.class, args);
    }

}
