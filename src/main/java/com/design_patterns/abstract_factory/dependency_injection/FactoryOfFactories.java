package com.design_patterns.abstract_factory.dependency_injection;

import com.design_patterns.abstract_factory.classic.modern.ModernFurnitureFactory;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.FurnitureFactory;
import com.design_patterns.abstract_factory.dependency_injection.victorian.VictorianFurnitureFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FactoryOfFactories {
    private final ModernFurnitureFactory modernFurnitureFactory;
    private final VictorianFurnitureFactory victorianFurnitureFactory;

    @Autowired
    public FactoryOfFactories(ModernFurnitureFactory modernFurnitureFactory, VictorianFurnitureFactory victorianFurnitureFactory) {
        this.modernFurnitureFactory = modernFurnitureFactory;
        this.victorianFurnitureFactory = victorianFurnitureFactory;
    }

    public FurnitureFactory getFactory(String type) {
        return switch (type.toLowerCase()) {
            case "modern" -> modernFurnitureFactory;
            case "victorian" -> victorianFurnitureFactory;
            default -> throw new IllegalArgumentException("Unknown factory type");
        };
    }
}
