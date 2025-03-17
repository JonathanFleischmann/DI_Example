package com.anti_patterns.ServiceLocator.console_logger;

import com.anti_patterns.ServiceLocator.console_logger.logger_services.ColorfulSymbolsConsoleLoggerService;
import com.anti_patterns.ServiceLocator.console_logger.logger_services.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class BadService {
    @Autowired
    private ApplicationContext applicationContext;

    public void logMessage(){
        // Ich brauche eine andere Klasse um etwas zu tun
        LoggerService logger = applicationContext.getBean(ColorfulSymbolsConsoleLoggerService.class); //Falls es diese Dependency beim Service Locator nicht gibt Failed der Code erst zur laufzeit
        //außerdem Abhängigkeit von Spring als Kontext
        logger.log("Message");
    }
}

