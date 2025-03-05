package com.example.dipraxisbeispiel.loggerBeans;

import com.example.dipraxisbeispiel.LoggerBeanAbstraction;
import org.springframework.stereotype.Component;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class Another implements LoggerBeanAbstraction {

    public Logger provideLogger() {
        Logger logger = Logger.getLogger("Another");
        ConsoleHandler consoleHandler = new ConsoleHandler();
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.WARNING);
        consoleHandler.setLevel(Level.WARNING);
        return logger;
    }
}
