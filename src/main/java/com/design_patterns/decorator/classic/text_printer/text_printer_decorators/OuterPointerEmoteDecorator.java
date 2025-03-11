package com.design_patterns.decorator.classic.text_printer.text_printer_decorators;

import com.design_patterns.decorator.classic.TextPrinter;
import com.design_patterns.decorator.classic.text_printer.TextPrinterDecorator;

public class OuterPointerEmoteDecorator extends TextPrinterDecorator {

    public OuterPointerEmoteDecorator(TextPrinter source) {
        super(source);
    }

    @Override
    public void print(String text) {
        super.print("👉" + text + "👈");
    }

    @Override
    public String read() {
        String unresolvedText = wrappee.read();
        // entferne die beiden Emojis
        return unresolvedText.substring(2, unresolvedText.length() - 2);
    }
}
