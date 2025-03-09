package com.implementation_example.console_logger_list_alternative;

import com.implementation_example.console_logger_list_alternative.logger_services.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Configuration
@ComponentScan("com.implementation_example.console_logger_list_alternative.logger_services")
public class LoggingController {

    private final List<LoggerService> loggerServices;

    public LoggingController(List<LoggerService> loggerServices) {
        this.loggerServices = loggerServices;
    }

    public void logMessage(String message) {
        for (LoggerService loggerService : loggerServices)
            loggerService.log(message);
    }
}
