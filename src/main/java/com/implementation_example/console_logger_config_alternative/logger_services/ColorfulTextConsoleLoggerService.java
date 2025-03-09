package com.implementation_example.console_logger_config_alternative.logger_services;

public class ColorfulTextConsoleLoggerService implements LoggerService {

    @Override
    public void log(String message) {
        Color color = Color.getRandomColorButReset();
        System.out.println("\nColorful Text Logger: " + color.getCode() + message + Color.RESET.getCode());
    }
}
