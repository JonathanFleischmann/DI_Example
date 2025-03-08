package com.design_patterns.abstract_factory.classic;

import com.design_patterns.abstract_factory.classic.interfaces.FurnitureFactory;
import com.design_patterns.abstract_factory.classic.modern.ModernFurnitureFactory;

public class ClientConfiguration {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();

        Client client = new Client(factory);
        client.printChairInformation();
    }
}
