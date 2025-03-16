package com.Scope.SingletonVsPrototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("singleton")
    public SingletonService singletonService() {
        return new SingletonService();
    }

    @Bean
    @Scope("prototype")
    public PrototypeService prototypeService() {
        return new PrototypeService();
    }
}


