package com.example.ServiceLocator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private ApplicationContext applicationContext;


    public void doSomething(){
        LoggerBeanAbstraction logger = applicationContext.getBean(LoggerBeanAbstraction.class); //Falls es diese Dependency beim Service Locator nicht gibt Failed der Code erst zur laufzeit
        //außerdem Abhängigkeit von Spring als Kontext
//        logger.doSomething() //TODO idk how the logger works
    }
}
