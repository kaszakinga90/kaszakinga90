package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HealthyShop implements FoodProducer {
    private Map<Product, Integer> productRegister;

    public HealthyShop() {
        productRegister = createProductRegister();
    }

    private Map<Product, Integer> createProductRegister() {

        Map<Product, Integer> productsList = new HashMap<>();

        productRegister.put(new GlutenFreeProduct("sausages", "pork sausages extra thin"), 200);
        productRegister.put(new GlutenFreeProduct("crisps", "Nachos with a cheese flavor"), 80);
        productRegister.put(new OilsProduct("virgin coconut oil", true), 200);
        productRegister.put(new OilsProduct("black seed oil", true), 100);

        return productRegister;
    }

    @Override
    public boolean process(Client client, Map<Product, Integer> productsOrders) {
        return (productsOrders.size() >= 2 && isProductsAvailable(productsOrders));
    }

    private boolean isProductsAvailable(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry: productsOrders.entrySet()) {
            Optional<Integer> productQuantity = Optional.ofNullable(productRegister.get(entry.getKey()));
            if (productQuantity.orElse(0) < entry.getValue()) {
                System.out.println("We don't have this product now. We're working on this. Try again later.");
                return false;
            }
        }
        return true;
    }
}
