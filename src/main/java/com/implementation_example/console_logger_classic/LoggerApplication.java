package com.implementation_example.console_logger_classic;

import com.implementation_example.console_logger_classic.logger_services.ColorfulWordsConsoleLoggerService;

public class LoggerApplication {

    public static void main(String[] args) {
        LoggingController loggingController = new LoggingController();
        loggingController.logMessage("Hallo, das ist ein Log-Eintrag!");
    }
}
