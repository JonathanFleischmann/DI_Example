package com.design_patterns.strategy.classic.strategies;

import com.design_patterns.strategy.classic.Strategy;

public class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
