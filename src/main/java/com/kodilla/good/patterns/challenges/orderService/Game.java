package com.kodilla.good.patterns.challenges.orderService;

public class Game implements Product {
    private final String title;
    private final int id;

    public Game(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    @Override
    public String getProductCategory() {
        return "Game";
    }
}
