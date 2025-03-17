package com.Scope.Key;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("singleton")
    @Qualifier("1")
    public SingletonService singletonService1() {
        return new SingletonService();
    }

    @Bean
    @Scope("singleton")
    @Qualifier("2")
    public SingletonService singletonService2() {
        return new SingletonService();
    }

    @Bean
    @Scope("prototype")
    public PrototypeService prototypeService() {
        return new PrototypeService();
    }
}


