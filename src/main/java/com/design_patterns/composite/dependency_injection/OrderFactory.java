package com.design_patterns.composite.dependency_injection;

import com.design_patterns.composite.dependency_injection.articles.Box;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class OrderFactory {
    private final ApplicationContext context;  // Zugriff auf den Spring DI-Container
    private final CompositeConfig compositeConfig;

    public OrderFactory(ApplicationContext context, CompositeConfig compositeConfig) {
        this.context = context;
        this.compositeConfig = compositeConfig;
    }

    @Bean
    public Article order() {  // Haupt-Composite, das alles zusammenführt
        return createComposite("order");
    }

    private Article createComposite(String name) {
        List<String> articleNames = compositeConfig.getComposites().get(name);
        if (articleNames == null) {
            throw new IllegalArgumentException("Unknown composite: " + name);
        }

        List<Article> articles = articleNames.stream()
                .map(this::getArticle)
                .collect(Collectors.toList());

        return new Box(articles);
    }

    private Article getArticle(String name) {
        if (compositeConfig.getComposites().containsKey(name)) { // Falls es sich um ein Composite handelt
            return createComposite(name);
        }
        return context.getBean(name, Article.class); // Normales Leaf-Bean aus dem DI-Container
    }
}
