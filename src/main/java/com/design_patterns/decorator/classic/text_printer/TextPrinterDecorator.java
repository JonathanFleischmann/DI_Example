package com.design_patterns.decorator.classic.text_printer;

import com.design_patterns.decorator.classic.TextPrinter;

public abstract class TextPrinterDecorator extends TextPrinter {
    protected TextPrinter wrappee;

    public TextPrinterDecorator(TextPrinter source) {
        this.wrappee = source;
    }

    @Override
    public void print(String text) {
        wrappee.print(text);
    }

    @Override
    public String read() {
        return wrappee.read();
    }
}
