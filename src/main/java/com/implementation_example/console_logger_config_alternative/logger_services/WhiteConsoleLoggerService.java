package com.implementation_example.console_logger_config_alternative.logger_services;

public class WhiteConsoleLoggerService implements LoggerService {
    @Override
    public void log(String message) {
        System.out.println("\nWhite Logger: " + message);
    }
}