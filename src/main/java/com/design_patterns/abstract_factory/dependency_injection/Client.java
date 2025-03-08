package com.design_patterns.abstract_factory.dependency_injection;

import com.design_patterns.abstract_factory.dependency_injection.interfaces.FurnitureFactory;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.Chair;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.CoffeeTable;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.Sofa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {

    private final FurnitureFactory furnitureFactory;

    @Autowired
    public Client(FactoryOfFactories factoryOfFactories) {
        this.furnitureFactory = factoryOfFactories.getFactory("modern");
    }

    public void printChairInformation() {
        Chair chair = furnitureFactory.getChair();
        chair.printChairPicture();
        chair.sitOn();
    }

    public void printCoffeeTableInformation() {
        CoffeeTable coffeeTable = furnitureFactory.getCoffeeTable();
        coffeeTable.printCoffeeTablePicture();
        coffeeTable.placeCoffee();
    }

    public void printSofaInformation() {
        Sofa sofa = furnitureFactory.getSofa();
        sofa.printSofaPicture();
        sofa.layOn();
    }
}
