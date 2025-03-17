package com.implementation_example.console_logger;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class LoggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoggerApplication.class, args);
    }

    @Bean
    ApplicationRunner runner(LoggingController loggingController) {
        return args -> loggingController.logMessage("Hallo, das ist ein Log-Eintrag!");
    }
}
