package com.anti_patterns.ServiceLocator.console_logger.logger_services;

import org.springframework.stereotype.Service;

@Service("colorfulSymbolsLogger") // Name für die Bean
public class ColorfulSymbolsConsoleLoggerService implements LoggerService {

    @Override
    public void log(String message) {
        // Färbe die Zeichen zufällig ein
        String coloredMessage = colorSymbols(message);
        System.out.println("\nColorful Symbols Logger: " + coloredMessage);
    }

    private String colorSymbols(String message) {
        StringBuilder coloredMessage = new StringBuilder();
        for (char c : message.toCharArray()) {
            coloredMessage.append(Color.getRandomColorButReset().getCode()).append(c);
        }
        coloredMessage.append(Color.RESET.getCode());
        return coloredMessage.toString();
    }
}
