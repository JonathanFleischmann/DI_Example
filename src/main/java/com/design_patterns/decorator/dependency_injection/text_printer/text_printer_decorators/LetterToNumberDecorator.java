package com.design_patterns.decorator.dependency_injection.text_printer.text_printer_decorators;

import com.design_patterns.decorator.dependency_injection.TextPrinter;
import com.design_patterns.decorator.dependency_injection.text_printer.TextPrinterDecorator;

public class LetterToNumberDecorator extends TextPrinterDecorator {

    public LetterToNumberDecorator(TextPrinter source) {
        super(source);
    }

    @Override
    public void print(String text) {
        // ersetze alle Zeichen durch entsprechende Zahlen
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            sb.append((int) c);
            sb.append(' ');
        }
        super.print(sb.toString());
    }

    @Override
    public String read() {
        String unresolvedText = wrappee.read();
        // lese die Zahlen und konvertiere sie in Zeichen
        StringBuilder sb = new StringBuilder();
        String[] numbers = unresolvedText.split(" ");
        for (String number : numbers) {
            sb.append((char) Integer.parseInt(number));
        }
        return sb.toString();
    }
}
