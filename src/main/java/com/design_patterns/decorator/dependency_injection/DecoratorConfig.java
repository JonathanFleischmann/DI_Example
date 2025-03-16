package com.design_patterns.decorator.dependency_injection;

import com.design_patterns.decorator.dependency_injection.text_printer.text_printer_decorators.LetterToNumberDecorator;
import com.design_patterns.decorator.dependency_injection.text_printer.text_printer_decorators.NumberToBinaryDecorator;
import com.design_patterns.decorator.dependency_injection.text_printer.ConsoleTextPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DecoratorConfig {

    @Bean
    public TextPrinter textPrinter() {
        TextPrinter textPrinter = new ConsoleTextPrinter();
        textPrinter = new NumberToBinaryDecorator(textPrinter);
        textPrinter = new LetterToNumberDecorator(textPrinter);
        return textPrinter;
    }
}
