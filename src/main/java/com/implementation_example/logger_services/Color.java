package com.implementation_example.logger_services;

import java.util.Random;

public enum Color {
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    RESET("\u001B[0m");

    private final String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Color getRandomColorButReset() {
        return Color.values()[new Random().nextInt(Color.values().length - 1)];
    }
}
