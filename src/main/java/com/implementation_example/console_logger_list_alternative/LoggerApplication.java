package com.implementation_example.console_logger_list_alternative;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LoggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoggerApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(LoggingController loggingController) {
        return args -> loggingController.logMessage("Hallo, das ist ein Log-Eintrag!");
    }
}
