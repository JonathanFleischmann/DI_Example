package com.design_patterns.abstract_factory.dependency_injection;

import com.design_patterns.abstract_factory.dependency_injection.interfaces.FurnitureFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FactoryOfFactories {
    List<FurnitureFactory> factories;

    @Autowired
    public FactoryOfFactories(List<FurnitureFactory> factories) {
        this.factories = factories;
    }

    public FurnitureFactory getFactory(FurnitureType type) {
        for (FurnitureFactory factory : factories) {
            if (factory.getFactoryType().equals(type)) {
                return factory;
            }
        }
        return null;
    }
}
