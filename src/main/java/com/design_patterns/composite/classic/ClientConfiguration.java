package com.design_patterns.composite.classic;

import com.design_patterns.composite.classic.articles.Box;
import com.design_patterns.composite.classic.articles.products.Notebook;
import com.design_patterns.composite.classic.articles.products.Smartphone;
import com.design_patterns.composite.classic.articles.products.Tablet;

public class ClientConfiguration {

    public static void main(String[] args) {
        Box orderSupplier1 = new Box();
        orderSupplier1.addArticle(new Smartphone());
        orderSupplier1.addArticle(new Tablet());

        Box orderSupplier2 = new Box();
        orderSupplier2.addArticle(new Notebook());

        Box order = new Box();
        order.addArticle(orderSupplier1);
        order.addArticle(orderSupplier2);

        Client client = new Client(order);
        client.printArticle();
    }
}
