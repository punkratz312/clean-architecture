package com.potucek.shop.drivers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.potucek.shop")
@AutoConfiguration
class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
