package com.implementation_example;

import com.implementation_example.logger_services.WhiteConsoleLoggerService;

public class LoggingController {

    private final WhiteConsoleLoggerService loggerService;

    public LoggingController() {
        this.loggerService = new WhiteConsoleLoggerService();
    }

    public void logMessage(String message) {
        loggerService.log(message);
    }
}
