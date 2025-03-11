package com.design_patterns.strategy.classic;

import com.design_patterns.strategy.classic.strategies.*;

public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyAdd());
        context.execute(new int[] {1, 2, 3, 4, 5});

        context.setStrategy(new ConcreteStrategySub());
        context.execute(new int[] {1, 2, 3, 4, 5});

        context.setStrategy(new ConcreteStrategyMul());
        context.execute(new int[] {1, 2, 3, 4, 5});
    }
}
