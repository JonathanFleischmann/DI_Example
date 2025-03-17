package com.implementation_example.console_logger_classic;

import com.implementation_example.console_logger_classic.logger_services.WhiteConsoleLoggerService;

public class LoggingController {

    private final WhiteConsoleLoggerService loggerService;

    public LoggingController() {
        this.loggerService = new WhiteConsoleLoggerService();
    }

    public void logMessage(String message) {
        loggerService.log(message);
    }
}
