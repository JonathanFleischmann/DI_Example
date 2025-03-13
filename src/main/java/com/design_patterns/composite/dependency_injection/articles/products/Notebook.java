package com.design_patterns.composite.dependency_injection.articles.products;

import com.design_patterns.composite.dependency_injection.Article;
import org.springframework.stereotype.Component;

@Component("notebook")
public class Notebook implements Article {

    @Override
    public int getPrice() {
        return 900;
    }

    @Override
    public String getPriceCalculation() {
        return "900(Notebook)";
    }

    @Override
    public String getDescription() {
        return "Notebook" + System.lineSeparator();
    }
}
