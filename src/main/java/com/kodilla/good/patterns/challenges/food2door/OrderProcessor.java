package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    private final Supplier supplier;
    private final OrderRequest orderRequest;

    public OrderProcessor(Supplier supplier, OrderRequest orderRequest) {
        this.supplier = supplier;
        this.orderRequest = orderRequest;
    }

    public String getSupplierInfo() {
        return "It's: " + this.supplier.getInfo() + ", they're selling: " + this.supplier.getProductType() + ", there're: " + this.supplier.getQuantity() + " products in stock";
    }
     public boolean orderProcess() {
        System.out.println(getSupplierInfo());
        this.supplier.process(orderRequest);
        return true;
     }


}
