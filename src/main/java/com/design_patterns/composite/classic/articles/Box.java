package com.design_patterns.composite.classic.articles;

import com.design_patterns.composite.classic.Article;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Box implements Article {
    private List<Article> articles;

    public Box() {
        this.articles = new ArrayList<>();
    }

    public void addArticle(Article article) {
        this.articles.add(article);
    }

    @Override
    public int getPrice() {
        return articles.stream().mapToInt(Article::getPrice).sum();
    }

    @Override
    public String getPriceCalculation() {
        return articles.stream()
                .map(Article::getPriceCalculation)
                .collect(Collectors.joining(" + ", "(", ")"));
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder();
        for (Article article : articles) {
            description.append(article.getDescription());
        }
        String resultText = description.toString().lines()
                .map(line -> "    " + line)
                .collect(Collectors.joining(System.lineSeparator()));
        return "Box:" + System.lineSeparator() + resultText + System.lineSeparator();
    }
}
