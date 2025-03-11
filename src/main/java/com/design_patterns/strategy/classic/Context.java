package com.design_patterns.strategy.classic;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int[] numberArray) {
        Integer interimResult = null;
        for (int number : numberArray) {
            if (interimResult == null) {
                interimResult = number;
                continue;
            }
            interimResult = strategy.execute(interimResult, number);
        }
        System.out.println("Result: " + interimResult);
    }
}
