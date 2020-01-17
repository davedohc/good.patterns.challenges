package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class OrderRequest {
    private final User user;
    private final LocalDateTime orderDate;
    private final Product product;

    public OrderRequest(User user, LocalDateTime orderDate, Product product) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }
}
