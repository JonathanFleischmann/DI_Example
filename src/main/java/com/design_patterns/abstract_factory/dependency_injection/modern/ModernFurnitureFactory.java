package com.design_patterns.abstract_factory.dependency_injection.modern;

import com.design_patterns.abstract_factory.dependency_injection.interfaces.FurnitureFactory;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.Chair;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.CoffeeTable;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.Sofa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// ConcreteFactory
@Configuration
@Component
@ComponentScan("com.design_patterns.abstract_factory.dependency_injection.modern")
public class ModernFurnitureFactory implements FurnitureFactory {
    @Autowired
    private Chair chair;

    @Autowired
    private CoffeeTable coffeeTable;

    @Autowired
    private Sofa sofa;

    @Override
    public Chair getChair() {
        return chair;
    }

    @Override
    public CoffeeTable getCoffeeTable() {
        return coffeeTable;
    }

    @Override
    public Sofa getSofa() {
        return sofa;
    }
}
