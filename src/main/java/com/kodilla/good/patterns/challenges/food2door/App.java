package com.kodilla.good.patterns.challenges.food2door;

public class App {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest order = orderRequestRetriever.retrieveOrder();
        OrderProcessor orderProcessor = new OrderProcessor(new GlutenFreeShop(), order);

        orderProcessor.orderProcess();
    }
}
