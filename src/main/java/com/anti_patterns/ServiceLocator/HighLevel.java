package com.anti_patterns.ServiceLocator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Configuration
@ComponentScan("com.anti_patterns.dipraxisbeispiel")
public class HighLevel {

    @Autowired
    List<MessageBeanAbstraction> messageBeanAbstractions;

    @Autowired
    List<LoggerBeanAbstraction> loggerBeanAbstractions;

    public void start() {
        for (MessageBeanAbstraction messageBeanAbstraction : messageBeanAbstractions)
            for (LoggerBeanAbstraction loggerBeanAbstraction : loggerBeanAbstractions)
                messageBeanAbstraction.printYourMessage(loggerBeanAbstraction.provideLogger());
    }
}
