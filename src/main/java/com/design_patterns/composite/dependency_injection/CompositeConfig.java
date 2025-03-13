package com.design_patterns.composite.dependency_injection;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "handlers")
public class CompositeConfig {
    private Map<String, List<String>> composites;

    public Map<String, List<String>> getComposites() {
        return composites;
    }

    public void setComposites(Map<String, List<String>> composites) {
        this.composites = composites;
    }
}
