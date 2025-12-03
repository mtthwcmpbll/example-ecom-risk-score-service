package com.example.ecom.risk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.ecom")
public class RiskScoreServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RiskScoreServiceApplication.class, args);
    }
}
