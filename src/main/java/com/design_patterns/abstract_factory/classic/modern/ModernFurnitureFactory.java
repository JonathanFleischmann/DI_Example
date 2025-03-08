package com.design_patterns.abstract_factory.classic.modern;

import com.design_patterns.abstract_factory.classic.interfaces.furniture.*;
import com.design_patterns.abstract_factory.classic.interfaces.FurnitureFactory;
import com.design_patterns.abstract_factory.classic.modern.furniture.*;

// ConcreteFactory
public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
