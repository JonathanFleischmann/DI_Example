package com.example.dipraxisbeispiel.messageBeans;

import com.example.dipraxisbeispiel.MessageBeanAbstraction;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class Lelleks implements MessageBeanAbstraction {
    public void printYourMessage(Logger logger) {
        logger.log(Level.WARNING, "Lelleks!");
    }
}
