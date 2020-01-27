package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Supplier {
    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("You have ordered: " + orderRequest.getProduct() + ", quantity: " + orderRequest.getQuantity());
        System.out.println("Healthiest food in the world");
    }

    public String getInfo() {
        return "This is healthy shop";
    }

    public String getProductType() {
        return "Magnez na niespokojne nogi";
    }

    public int getQuantity() {
        return 300;
    }
}
