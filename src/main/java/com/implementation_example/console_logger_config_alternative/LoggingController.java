package com.implementation_example.console_logger_config_alternative;

import com.implementation_example.console_logger_config_alternative.logger_services.LoggerService;
import org.springframework.stereotype.Service;

@Service
public class LoggingController {

    private final LoggerService loggerService;

    public LoggingController(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public void logMessage(String message) {
        loggerService.log(message);
    }
}
