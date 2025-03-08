package com.design_patterns.abstract_factory.dependency_injection;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientConfiguration {

    private final Client client;

    public ClientConfiguration(Client client) {
        this.client = client;
    }

    public void start() {
        client.printChairInformation();
    }


    public static void main(String[] args) {
        SpringApplication.run(ClientConfiguration.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> start();
    }
}
