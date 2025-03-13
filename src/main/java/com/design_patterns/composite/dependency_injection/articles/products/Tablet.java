package com.design_patterns.composite.dependency_injection.articles.products;

import com.design_patterns.composite.dependency_injection.Article;
import org.springframework.stereotype.Component;

@Component("tablet")
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
