package com.implementation_example.console_logger_list_alternative.logger_services;

import org.springframework.stereotype.Component;

@Component
public class WhiteConsoleLoggerService implements LoggerService {
    @Override
    public void log(String message) {
        System.out.println("\nWhite Logger: " + message);
    }
}