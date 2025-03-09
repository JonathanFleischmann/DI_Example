package com.implementation_example.console_logger;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LoggingController {

    private final LoggerService loggerService;

    // Dependency Injection mit @Qualifier zum Auswählen des Loggers
    public LoggingController(@Qualifier("colorfulSymbolsLogger") LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public void logMessage(String message) {
        loggerService.log(message);
    }
}
