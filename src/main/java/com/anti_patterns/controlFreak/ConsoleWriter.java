package com.anti_patterns.controlFreak;

import org.springframework.stereotype.Service;

@Service
public class ConsoleWriter implements IMessageWriter{
    @Override
    public void write(String toWrite) {
        System.out.println(toWrite); //-> Abhängigkeit System. muss nicht abstrahiert werden
    }


    public static void combineWrite(String string1, String string2){
        //TODO implement logic
        //-> Dependencies in Entwicklung sollten weg abstrahiert werden
    }
}
