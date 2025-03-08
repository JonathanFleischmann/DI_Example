package com.anti_patterns.controlFreak;

public class ControlFreak {

    private final ConsoleWriter messageWriter; //Selbst wenn von typ IMessageWriter

    public ControlFreak() {
        messageWriter = new ConsoleWriter(); // Abhängigkeit von ConsoleWriter
    }

    public void sayHello() {
        messageWriter.write("Hello");
    }

    public void sayGoodbye() {
        ConsoleWriter.combineWrite("gooodbye","mom"); //ohne new, trotzdem Controll Freak
    }

}
