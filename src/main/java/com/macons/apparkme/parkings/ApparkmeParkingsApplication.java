package com.macons.apparkme.parkings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApparkmeParkingsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApparkmeParkingsApplication.class, args);
    }

}
