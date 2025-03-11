package com.design_patterns.decorator.dependency_injection.text_printer.text_printer_decorators;

import com.design_patterns.decorator.dependency_injection.TextPrinter;
import com.design_patterns.decorator.dependency_injection.text_printer.TextPrinterDecorator;

public class InnerHighFiveEmoteDecorator extends TextPrinterDecorator {

    public InnerHighFiveEmoteDecorator(TextPrinter source) {
        super(source);
    }

    @Override
    public void print(String text) {
        super.print("🫷" + text + "🫸");
    }

    @Override
    public String read() {
        String unresolvedText = wrappee.read();
        // entferne die beiden Emojis
        return unresolvedText.substring(2, unresolvedText.length() - 2);
    }
}
