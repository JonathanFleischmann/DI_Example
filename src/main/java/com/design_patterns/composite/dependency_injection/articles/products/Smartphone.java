package com.design_patterns.composite.dependency_injection.articles.products;

import com.design_patterns.composite.dependency_injection.Article;
import org.springframework.stereotype.Component;

@Component("smartphone")
public class Smartphone implements Article {

    @Override
    public int getPrice() {
        return 400;
    }

    @Override
    public String getPriceCalculation() {
        return "400(Smartphone)";
    }

    @Override
    public String getDescription() {
        return "Smartphone" + System.lineSeparator();
    }
}
