package com.anti_patterns.controlFreak;

public class DependencyInjection {

    private final IMessageWriter messageWriter;

    public DependencyInjection(IMessageWriter messageWriter) {
        this.messageWriter = messageWriter; //-> messageWriter soll austauschbar sein
    }

    public void sayHello() {
        messageWriter.write("Hello");
    }


}
