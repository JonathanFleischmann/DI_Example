package com.design_patterns.strategy.dependency_injection;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Client {

    private final Context context;

    public Client(Context context) {
        this.context = context;
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {
            context.execute(new int[] {1, 2, 3, 4, 5}, "Addition");
            context.execute(new int[] {1, 2, 3, 4, 5}, "Subtraction");
            context.execute(new int[] {1, 2, 3, 4, 5}, "Multiplication");
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }
}
