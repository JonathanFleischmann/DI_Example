package com.design_patterns.abstract_factory.classic.victorian;

import com.design_patterns.abstract_factory.classic.interfaces.furniture.*;
import com.design_patterns.abstract_factory.classic.interfaces.FurnitureFactory;
import com.design_patterns.abstract_factory.classic.victorian.furniture.*;

// ConcreteFactory
public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
