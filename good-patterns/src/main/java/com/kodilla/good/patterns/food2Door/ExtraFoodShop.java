package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements FoodProducer {
    private Map<Product, Integer> productRegister;

    public ExtraFoodShop() {
        productRegister = createProductRegister();
    }

    private Map<Product, Integer> createProductRegister() {
        Map<Product, Integer> productRegister = new HashMap<>();

        productRegister.put(new SuperfoodProduct("erytrol", "sweetener"), 1);
        productRegister.put(new SuperfoodProduct("almond flour", "flour"), 50);
        productRegister.put(new OilsProduct("linseed oil", true), 100);
        productRegister.put(new OilsProduct("pumpkin seed oil", false), 0);

        return productRegister;
    }

    @Override
    public boolean process(Client client, Map<Product, Integer>productsOrders) {

        for (Map.Entry<Product, Integer> entry: productsOrders.entrySet()){
            Optional<Integer> productQuantity = Optional.ofNullable(productRegister.get(entry.getKey()));
            if (productQuantity.orElse(0) < entry.getValue()) {
                System.out.println("We don't have this product now. We're working on this. Try another day.");
                return false;
            }
        }
        return true;
    }
}
