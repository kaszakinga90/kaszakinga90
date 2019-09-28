package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public interface FoodProducer {
    boolean process(Client client, Map<Product, Integer> productsOrders);
}
