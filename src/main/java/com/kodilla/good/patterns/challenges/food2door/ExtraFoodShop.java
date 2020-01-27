package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Supplier {
    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("You have ordered: " + orderRequest.getProduct() + ", quantity: " + orderRequest.getQuantity());
        System.out.println("Our food is the best");
    }
    public String getInfo(){
        return "This is Extra food shop";
    }
    public String getProductType() {
        return "Extra energy drink ";
    }
    public int getQuantity() {
        return 100;
    }
}
