package com.design_patterns.composite.classic.articles.products;

import com.design_patterns.composite.classic.Article;

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
