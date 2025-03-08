package com.design_patterns.abstract_factory.dependency_injection.victorian;

import com.design_patterns.abstract_factory.dependency_injection.interfaces.FurnitureFactory;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.Chair;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.CoffeeTable;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.Sofa;
import com.design_patterns.abstract_factory.dependency_injection.victorian.furniture.VictorianChair;
import com.design_patterns.abstract_factory.dependency_injection.victorian.furniture.VictorianCoffeeTable;
import com.design_patterns.abstract_factory.dependency_injection.victorian.furniture.VictorianSofa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// ConcreteFactory
@Configuration
@Component
@ComponentScan("com.design_patterns.abstract_factory.dependency_injection.victorian")
public class VictorianFurnitureFactory implements FurnitureFactory {
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
