package com.design_patterns.strategy.dependency_injection;

public interface Strategy {
    int execute(int a, int b);

    String getStrategyName();
}
