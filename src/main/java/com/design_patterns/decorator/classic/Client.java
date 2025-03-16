package com.design_patterns.decorator.classic;

import com.design_patterns.decorator.classic.text_printer.ConsoleTextPrinter;
import com.design_patterns.decorator.classic.text_printer.text_printer_decorators.*;

public class Client {
    public static void main(String[] args) {
        System.out.println("Message:\nHello World!");

        TextPrinter numberedTextPrinter = new ConsoleTextPrinter();
        numberedTextPrinter = new LetterToNumberDecorator(numberedTextPrinter);

        System.out.println("\nNumbered Message:");
        numberedTextPrinter.print("Hello World!");

        System.out.println(numberedTextPrinter.read());

        TextPrinter binaryTextPrinter = new ConsoleTextPrinter();
        binaryTextPrinter = new NumberToBinaryDecorator(binaryTextPrinter);
        binaryTextPrinter = new LetterToNumberDecorator(binaryTextPrinter);

        System.out.println("\nBinary Message:");
        binaryTextPrinter.print("Hello World!");

        System.out.println(binaryTextPrinter.read());
    }
}
