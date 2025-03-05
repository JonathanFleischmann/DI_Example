package com.example.ServiceLocator.messageBeans;

import com.example.ServiceLocator.MessageBeanAbstraction;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class Hello implements MessageBeanAbstraction {
    public void printYourMessage(Logger logger) {
        logger.log(Level.ALL, "Hello!");
    }
}
