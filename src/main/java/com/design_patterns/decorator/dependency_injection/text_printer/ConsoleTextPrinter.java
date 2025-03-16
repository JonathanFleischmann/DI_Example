package com.design_patterns.decorator.dependency_injection.text_printer;

import com.design_patterns.decorator.dependency_injection.TextPrinter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleTextPrinter extends TextPrinter {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outputStream);

    @Override
    public void print(String text) {
        System.out.println(text);
        printStream.println(text);
    }

    @Override
    public String read() {
        String[] lines = outputStream.toString().split(System.lineSeparator());
        return lines.length > 0 ? lines[lines.length - 1] : "";
    }
}
