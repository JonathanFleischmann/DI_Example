package com.anti_patterns.ServiceLocator.console_logger.logger_services;

import org.springframework.stereotype.Service;

@Service("colorfulTextLogger") // Name für die Bean
public class ColorfulTextConsoleLoggerService implements LoggerService {

    @Override
    public void log(String message) {
        Color color = Color.getRandomColorButReset();
        System.out.println("\nColorful Text Logger: " + color.getCode() + message + Color.RESET.getCode());
    }
}
