package com.example.dipraxisbeispiel.loggerBeans;

import com.example.dipraxisbeispiel.LoggerBeanAbstraction;
import org.springframework.stereotype.Component;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class Console implements LoggerBeanAbstraction {

    public Logger provideLogger() {
        Logger logger = Logger.getLogger("MyLogger");
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);
        return logger;
    }
}
