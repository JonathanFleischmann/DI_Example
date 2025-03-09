package com.implementation_example.console_logger.logger_services;

import com.implementation_example.console_logger.LoggerService;
import org.springframework.stereotype.Service;

@Service("whiteLogger") // Name für die Bean
public class WhiteConsoleLoggerService implements LoggerService {
    @Override
    public void log(String message) {
        System.out.println("\nSimple Logger: " + message);
    }
}