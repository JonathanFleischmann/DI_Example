package com.design_patterns.composite.classic.articles.products;

import com.design_patterns.composite.classic.Article;

public class Tablet implements Article {

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String getPriceCalculation() {
        return "500(Tablet)";
    }

    @Override
    public String getDescription() {
        return "Tablet" + System.lineSeparator();
    }
}
