package com.example.demo;

import com.example.demo.repository.bace.BaceReposiroryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.example.demo.Web.api")
@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.example.demo.repository", repositoryBaseClass = BaceReposiroryImpl.class)
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
