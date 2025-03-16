package com.design_patterns.composite.classic;

public class Client {
    private final Article article;

    public Client(Article article) {
        this.article = article;
    }

    public void printArticle() {
        System.out.println(article.getDescription());
        System.out.println("\nPrice calculation: " + article.getPriceCalculation());
        System.out.println("\nTotal price: " + article.getPrice());
    }


}
