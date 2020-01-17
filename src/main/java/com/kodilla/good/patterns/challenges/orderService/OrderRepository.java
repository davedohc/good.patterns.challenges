package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(User user, LocalDateTime orderDate, Product product);
}
