package com.example.ServiceLocator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DiPraxisbeispielApplication {

    @Autowired
    private HighLevel highLevel;

    public void start() {
        highLevel.start();
    }

    public static void main(String[] args) {
        SpringApplication.run(DiPraxisbeispielApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> start();
    }
}
