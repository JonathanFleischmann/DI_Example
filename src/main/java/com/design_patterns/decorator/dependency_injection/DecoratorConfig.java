package com.design_patterns.decorator.dependency_injection;

import com.design_patterns.decorator.dependency_injection.text_printer.LogFileTextPrinter;
import com.design_patterns.decorator.dependency_injection.text_printer.text_printer_decorators.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DecoratorConfig {

    @Bean
    public TextPrinter textPrinter() {
        TextPrinter textPrinter = new LogFileTextPrinter();
        textPrinter = new AngryPersonEmoteDecorator(textPrinter);
        textPrinter = new OuterHighFiveEmoteDecorator(textPrinter);
        textPrinter = new InnerFistEmoteDecorator(textPrinter);
        textPrinter = new HappyPersonEmoteDecorator(textPrinter);
        return textPrinter;
    }
}
