package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Stefan", "Telefan", 834780943, "zimowa 2/8, poznan");
        LocalDateTime orderDate = LocalDateTime.now();
        Product product = new Game("Witcher", 378237);

        return new OrderRequest(user, orderDate, product);
    }
}
