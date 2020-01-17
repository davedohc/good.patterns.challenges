package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
   public boolean order(User user, LocalDateTime orderDate, Product product) {
       System.out.println(user.getName() + " " + user.getSurname() + " ordered: " + product.getProductCategory() + ": " + product.getTitle() + ", item id: " + product.getId());

       return true;
   }
}
