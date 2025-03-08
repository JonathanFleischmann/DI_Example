package com.design_patterns.abstract_factory.dependency_injection.modern;

import com.design_patterns.abstract_factory.dependency_injection.FurnitureType;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.FurnitureFactory;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.Chair;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.CoffeeTable;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.Sofa;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// ConcreteFactory
@Component
public class ModernFurnitureFactory implements FurnitureFactory {
    private final Chair chair;

    private final CoffeeTable coffeeTable;

    private final Sofa sofa;

    public ModernFurnitureFactory(@Qualifier("modernChair") Chair chair, @Qualifier("modernCoffeeTable") CoffeeTable coffeeTable, @Qualifier("modernSofa") Sofa sofa) {
        this.chair = chair;
        this.coffeeTable = coffeeTable;
        this.sofa = sofa;
    }

    @Override
    public FurnitureType getFactoryType() {
        return FurnitureType.MODERN;
    }

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
