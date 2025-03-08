package com.design_patterns.abstract_factory.dependency_injection.interfaces;

import com.design_patterns.abstract_factory.dependency_injection.FurnitureType;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.Chair;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.CoffeeTable;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.Sofa;

// Abstract Factory
public interface FurnitureFactory {
    FurnitureType getFactoryType();

    Chair getChair();
    CoffeeTable getCoffeeTable();
    Sofa getSofa();
}
