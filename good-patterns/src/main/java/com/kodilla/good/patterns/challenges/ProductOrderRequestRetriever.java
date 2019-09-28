package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {
        User user = new User("smileKate", "Kate", "Pool");
        LocalDateTime orderDate = LocalDateTime.of(2019, 3, 30, 16, 18);
        Product product = new Mascara("Maybelline",
                "deep black, curly",
                new BigDecimal("80"));
        int quantity = 1;

        System.out.println("Retrieve product request:");
        System.out.println("User: " + user.getUserName() +
                " Date: " + orderDate + "\n" +
                product + ", quantity=" + quantity);
        return new ProductOrderRequest(user, orderDate, product, quantity);
    }
}
