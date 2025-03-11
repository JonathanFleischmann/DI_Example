package com.design_patterns.decorator;

import com.design_patterns.decorator.text_printer.LogFileTextPrinter;
import com.design_patterns.decorator.text_printer.text_printer_decorators.*;

public class Client {
    public static void main(String[] args) {
        LogFileTextPrinter logFileTextPrinter = new LogFileTextPrinter();

        logFileTextPrinter.print("Hello, World!\n");

        TextPrinter textPrinter = new LogFileTextPrinter();
        textPrinter = new AngryPersonEmoteDecorator(textPrinter);
        textPrinter = new OuterPointerEmoteDecorator(textPrinter);
        textPrinter = new InnerHighFiveEmoteDecorator(textPrinter);
        textPrinter = new HappyPersonEmoteDecorator(textPrinter);
        textPrinter = new OuterFistEmoteDecorator(textPrinter);
        textPrinter = new InnerFistEmoteDecorator(textPrinter);
        textPrinter = new HappyPersonEmoteDecorator(textPrinter);

        textPrinter.print("Hello");

        System.out.println(textPrinter.read());
    }
}
