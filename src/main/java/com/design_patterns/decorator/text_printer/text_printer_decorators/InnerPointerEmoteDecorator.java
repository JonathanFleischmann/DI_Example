package com.design_patterns.decorator.text_printer.text_printer_decorators;

import com.design_patterns.decorator.TextPrinter;
import com.design_patterns.decorator.text_printer.TextPrinterDecorator;

public class InnerPointerEmoteDecorator extends TextPrinterDecorator {

    public InnerPointerEmoteDecorator(TextPrinter source) {
        super(source);
    }

    @Override
    public void print(String text) {
        super.print("👈" + text + "👉");
    }

    @Override
    public String read() {
        String unresolvedText = wrappee.read();
        // entferne die beiden Emojis
        return unresolvedText.substring(2, unresolvedText.length() - 2);
    }
}
