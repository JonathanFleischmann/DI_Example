package com.design_patterns.strategy.dependency_injection;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class Context {

    private final Map<String, Strategy> strategyMap;

    public Context(List<Strategy> strategies) {
        this.strategyMap = strategies.stream()
                .collect(Collectors.toMap(Strategy::getStrategyName, strategy -> strategy));
    }

    public void execute(int[] numberArray, String strategyName) {
        Strategy strategy = strategyMap.get(strategyName);
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy not found: " + strategyName);
        }

        Integer interimResult = null;
        for (int number : numberArray) {
            if (interimResult == null) {
                interimResult = number;
            } else {
                interimResult = strategy.execute(interimResult, number);
            }
        }
        System.out.println("Result with " + strategyName + ": " + interimResult);
    }
}
