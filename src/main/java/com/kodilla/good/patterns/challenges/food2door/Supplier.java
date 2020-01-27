package com.kodilla.good.patterns.challenges.food2door;

public interface Supplier {
    void process(OrderRequest orderRequest);
    String getInfo();
    String getProductType();
    int getQuantity();
}
