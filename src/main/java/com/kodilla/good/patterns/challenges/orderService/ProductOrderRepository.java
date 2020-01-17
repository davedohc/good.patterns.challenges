package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {
    public boolean createOrder(User user, LocalDateTime orderDate, Product product) {
        System.out.println("Order saved in data base");
        return true;
    }
}
