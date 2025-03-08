package com.design_patterns.abstract_factory.dependency_injection;

import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.Chair;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.CoffeeTable;
import com.design_patterns.abstract_factory.dependency_injection.interfaces.furniture.Sofa;
import com.design_patterns.abstract_factory.dependency_injection.modern.furniture.ModernChair;
import com.design_patterns.abstract_factory.dependency_injection.modern.furniture.ModernCoffeeTable;
import com.design_patterns.abstract_factory.dependency_injection.modern.furniture.ModernSofa;
import com.design_patterns.abstract_factory.dependency_injection.victorian.furniture.VictorianChair;
import com.design_patterns.abstract_factory.dependency_injection.victorian.furniture.VictorianCoffeeTable;
import com.design_patterns.abstract_factory.dependency_injection.victorian.furniture.VictorianSofa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FurnitureConfig {

    @Bean
    public FurnitureType furnitureType() {
        return FurnitureType.MODERN;
    }

    @Bean
    public Chair modernChair() {
        return new ModernChair();
    }

    @Bean
    public CoffeeTable modernCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Bean
    public Sofa modernSofa() {
        return new ModernSofa();
    }

    @Bean
    public Chair victorianChair() {
        return new VictorianChair();
    }

    @Bean
    public CoffeeTable victorianCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Bean
    public Sofa victorianSofa() {
        return new VictorianSofa();
    }
}
