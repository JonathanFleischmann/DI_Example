package com.design_patterns.decorator.dependency_injection.text_printer.text_printer_decorators;

import com.design_patterns.decorator.dependency_injection.TextPrinter;
import com.design_patterns.decorator.dependency_injection.text_printer.TextPrinterDecorator;

public class NumberToBinaryDecorator extends TextPrinterDecorator {

    public NumberToBinaryDecorator(TextPrinter source) {
        super(source);
    }

    @Override
    public void print(String text) {
        // ersetze alle Zahlen durch entsprechende Binärzahlen
        StringBuilder sb = new StringBuilder();
        String[] numbers = text.split(" ");
        for (String number : numbers) {
            sb.append(Integer.toBinaryString(Integer.parseInt(number)));
            sb.append(' ');
        }
        super.print(sb.toString());
    }

    @Override
    public String read() {
        String unresolvedText = wrappee.read();
        // lese die Binärzahlen und konvertiere sie in Zahlen
        StringBuilder sb = new StringBuilder();
        String[] binaryNumbers = unresolvedText.split(" ");
        for (String binaryNumber : binaryNumbers) {
            sb.append(Integer.parseInt(binaryNumber, 2));
            sb.append(' ');
        }
        return sb.toString();
    }
}
