package com.design_patterns.decorator.test_improve_by_dependency_injection;

import com.design_patterns.decorator.dependency_injection.Client;
import com.design_patterns.decorator.dependency_injection.DecoratorConfig;
import com.design_patterns.decorator.dependency_injection.TextPrinter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

@SpringBootTest
public class ExampleTest {

    @Configuration
    @Import(DecoratorConfig.class)
    static class TestConfig {
        @Bean
        @Primary
        public TextPrinter testTextPrinter(TextPrinter source) {
            return new TestDecorator(source);
        }

        @Bean
        public Client client(TextPrinter textPrinter) {
            return new Client(textPrinter);
        }
    }

    @Autowired
    private Client client;

    @Test
    public void testClient() {
        client.start();
    }
}