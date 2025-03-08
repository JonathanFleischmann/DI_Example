package com.design_patterns.abstract_factory.classic.interfaces;

import com.design_patterns.abstract_factory.classic.interfaces.furniture.Chair;
import com.design_patterns.abstract_factory.classic.interfaces.furniture.CoffeeTable;
import com.design_patterns.abstract_factory.classic.interfaces.furniture.Sofa;

// Abstract Factory
public interface FurnitureFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}
