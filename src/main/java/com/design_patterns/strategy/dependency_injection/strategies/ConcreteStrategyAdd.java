package com.design_patterns.strategy.dependency_injection.strategies;

import com.design_patterns.strategy.dependency_injection.Strategy;
import org.springframework.stereotype.Component;

@Component
public class ConcreteStrategyAdd implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }

    @Override
    public String getStrategyName() {
        return "Addition";
    }
}
