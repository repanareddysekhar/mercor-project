package com.mercor.mercorproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MercorProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MercorProjectApplication.class, args);
    }

}
