package com.implementation_example.console_logger_classic;

import com.implementation_example.console_logger_classic.logger_services.WhiteConsoleLoggerService;

public class LoggingController {

    private final WhiteConsoleLoggerService whiteConsoleLoggerService;

    public LoggingController() {
        this.whiteConsoleLoggerService = new WhiteConsoleLoggerService();
    }

    public void logMessage(String message) {
        whiteConsoleLoggerService.log(message);
    }
}
