package com.design_patterns.decorator.classic.text_printer;

import com.design_patterns.decorator.classic.TextPrinter;

import java.io.*;

public class LogFileTextPrinter extends TextPrinter {

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
