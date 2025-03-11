package com.design_patterns.decorator.dependency_injection;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Client {

    private final TextPrinter textPrinter;

    public Client(TextPrinter textPrinter) {
        this.textPrinter = textPrinter;
    }

    public void start() {
        textPrinter.print("HeyHo!");

        System.out.println(textPrinter.read());
    }

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> start();
    }
}
