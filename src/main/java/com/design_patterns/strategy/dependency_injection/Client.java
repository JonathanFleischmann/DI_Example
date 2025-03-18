package com.design_patterns.strategy.dependency_injection;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Client {

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(Context context) {
        return args -> {
            context.execute(new int[] {1, 2, 3, 4, 5}, "Addition");
            context.execute(new int[] {1, 2, 3, 4, 5}, "Subtraction");
            context.execute(new int[] {1, 2, 3, 4, 5}, "Multiplication");
        };
    }
}
