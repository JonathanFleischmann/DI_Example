package com.implementation_example.console_logger_config_alternative;

import com.implementation_example.console_logger_config_alternative.logger_services.ColorfulSymbolsConsoleLoggerService;
import com.implementation_example.console_logger_config_alternative.logger_services.LoggerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggerConfig {
    @Bean
    public LoggerService loggerService() {
        return new ColorfulSymbolsConsoleLoggerService();
    }
}
