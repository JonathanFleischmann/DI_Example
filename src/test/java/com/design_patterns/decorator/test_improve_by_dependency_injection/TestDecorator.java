package com.design_patterns.decorator.test_improve_by_dependency_injection;

import com.design_patterns.decorator.dependency_injection.TextPrinter;
import com.design_patterns.decorator.dependency_injection.text_printer.TextPrinterDecorator;

public class TestDecorator extends TextPrinterDecorator {
    public TestDecorator(TextPrinter source) {
        super(source);
    }

    @Override
    public void print(String text) {
        super.print("TestDecorator: " + text);
    }

    @Override
    public String read() {
        return super.read();
    }
}
