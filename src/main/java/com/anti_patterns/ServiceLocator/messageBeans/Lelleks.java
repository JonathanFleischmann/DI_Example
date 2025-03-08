package com.anti_patterns.ServiceLocator.messageBeans;

import com.anti_patterns.ServiceLocator.MessageBeanAbstraction;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class Lelleks implements MessageBeanAbstraction {
    public void printYourMessage(Logger logger) {
        logger.log(Level.WARNING, "Lelleks!");
    }
}
