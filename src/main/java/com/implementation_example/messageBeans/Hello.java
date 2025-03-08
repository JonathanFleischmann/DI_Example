package com.implementation_example.messageBeans;

import com.implementation_example.MessageBeanAbstraction;
import org.springframework.stereotype.Component;

import java.util.logging.*;

@Component
public class Hello implements MessageBeanAbstraction {
    public void printYourMessage(Logger logger) {
        logger.log(Level.ALL, "Hello!");
    }
}
