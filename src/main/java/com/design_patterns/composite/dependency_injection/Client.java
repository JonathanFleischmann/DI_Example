package com.design_patterns.composite.dependency_injection;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.design_patterns.composite.dependency_injection")
public class Client {

    private final OrderFactory orderFactory;

    public Client(OrderFactory orderFactory) {
        this.orderFactory = orderFactory;
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {
            System.out.println(this.orderFactory.order().getDescription());
            System.out.println(this.orderFactory.order().getPriceCalculation());
            System.out.println("Price: " + this.orderFactory.order().getPrice());
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }
}
