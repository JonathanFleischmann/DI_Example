package com.example.dipraxisbeispiel.messageBeans;

import com.example.dipraxisbeispiel.MessageBeanAbstraction;
import org.springframework.stereotype.Component;

import java.util.logging.*;

@Component
public class Hello implements MessageBeanAbstraction {
    public void printYourMessage(Logger logger) {
        logger.log(Level.ALL, "Hello!");
    }
}
