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
    public ApplicationRunner applicationRunner(OrderFactory orderFactory) {
        return args -> {
            Article article = orderFactory.order();
            System.out.println(article.getDescription());
            System.out.println(article.getPriceCalculation());
            System.out.println("Price: " + article.getPrice());
        };
    }
}
