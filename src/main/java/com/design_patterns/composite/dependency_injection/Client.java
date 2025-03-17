package com.design_patterns.composite.dependency_injection;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Client {

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(Article order) {
        return args -> {
            System.out.println(order.getDescription());
            System.out.println(order.getPriceCalculation());
            System.out.println("Price: " + order.getPrice());
        };
    }
}
