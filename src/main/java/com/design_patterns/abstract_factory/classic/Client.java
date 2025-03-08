package com.design_patterns.abstract_factory.classic;

import com.design_patterns.abstract_factory.classic.interfaces.FurnitureFactory;
import com.design_patterns.abstract_factory.classic.interfaces.furniture.*;

public class Client {

    private final FurnitureFactory furnitureFactory;

    public Client(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public void printChairInformation() {
        Chair chair = furnitureFactory.createChair();
        chair.printChairPicture();
        chair.sitOn();
    }

    public void printCoffeeTableInformation() {
        CoffeeTable coffeeTable = furnitureFactory.createCoffeeTable();
        coffeeTable.printCoffeeTablePicture();
        coffeeTable.placeCoffee();
    }

    public void printSofaInformation() {
        Sofa sofa = furnitureFactory.createSofa();
        sofa.printSofaPicture();
        sofa.layOn();
    }
}
