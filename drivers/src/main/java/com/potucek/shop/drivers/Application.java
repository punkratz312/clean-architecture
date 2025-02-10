package com.potucek.shop.drivers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.Modulith;
import org.springframework.modulith.Modulithic;

@SpringBootApplication(scanBasePackages = "com.potucek.shop")
@AutoConfiguration
@Modulith
@Modulithic
class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
