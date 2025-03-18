package com.implementation_example;

import com.implementation_example.logger_services.WhiteConsoleLoggerService;

public class LoggerApplication {

    public static void main(String[] args) {
        WhiteConsoleLoggerService loggerService = new WhiteConsoleLoggerService();
        loggerService.log("Hallo, das ist ein Log-Eintrag!");
    }
}