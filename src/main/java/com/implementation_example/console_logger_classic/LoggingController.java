package com.implementation_example.console_logger_classic;

import com.implementation_example.console_logger_classic.logger_services.LoggerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class LoggingController {

    private final LoggerService loggerService;

    public LoggingController(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public void logMessage(String message) {
        loggerService.log(message);
    }
}
