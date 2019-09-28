package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {

    public List<OrderRequest> retrieve() {
        List<OrderRequest> orderRequestRegister = new ArrayList<>();

        Client client = new Client("JackDaniels");
        FoodProducer foodProducer = new GlutenFreeShop();
        Map<Product, Integer> productRegister = new HashMap<>();
        productRegister.put(new GlutenFreeProduct("pasta", "low-protein pasta, thick ribbons"), 3);
        productRegister.put(new GlutenFreeProduct("desserts", "pudding with raspberry flavor"), 2);
        productRegister.put(new GlutenFreeProduct("soups", "vegetable broth, cubes"), 12);

        orderRequestRegister.add(new OrderRequest(client, foodProducer, productRegister));

        Client client1 = new Client("Anastasia98");
        FoodProducer foodProducer1 = new GlutenFreeShop();
        Map<Product, Integer> productRegister1 = new HashMap<>();
        productRegister.put(new GlutenFreeProduct("pasta", "low-protein pasta, thick ribbons"), 1);
        productRegister.put(new GlutenFreeProduct("desserts", "pudding with raspberry flavor"), 6);
        productRegister.put(new GlutenFreeProduct("soups", "vegetable broth, cubes"), 15);

        orderRequestRegister.add(new OrderRequest(client1, foodProducer1, productRegister1));

        return orderRequestRegister;
    }
}
