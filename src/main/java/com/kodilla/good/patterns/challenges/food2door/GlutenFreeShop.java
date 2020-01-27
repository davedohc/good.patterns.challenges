package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Supplier {
    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("You have ordered: " + orderRequest.getProduct() + ", quantity: " + orderRequest.getQuantity());
        System.out.println("Gluten is the best");
    }
    public String getInfo(){
        return "This is gluten free shop";
    }
    public String getProductType() {
        return "Bezglutenowy falafel i sojowe latte";
    }
    public int getQuantity() {
        return 200;
    }
}
