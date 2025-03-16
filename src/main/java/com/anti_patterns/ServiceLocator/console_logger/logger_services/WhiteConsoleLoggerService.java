package com.anti_patterns.ServiceLocator.console_logger.logger_services;

import org.springframework.stereotype.Service;

@Service("whiteLogger") // Name für die Bean
public class WhiteConsoleLoggerService implements LoggerService {
    @Override
    public void log(String message) {
        System.out.println("\nWhite Logger: " + message);
    }
}