package com.kodilla.good.patterns.food2Door;

import java.util.*;

public class GlutenFreeShop implements FoodProducer {
    private Map<Product, Integer> productRegister;
    private List<Client> blackList;

    public GlutenFreeShop() {
        productRegister = createProductRegister();
        blackList = createBlackList();
    }

    private Map<Product, Integer> createProductRegister() {

        Map<Product, Integer> productRegister = new HashMap<>();

        productRegister.put(new GlutenFreeProduct("pasta", "low-protein pasta, thick ribbons"), 30);
        productRegister.put(new GlutenFreeProduct("desserts", "pudding with raspberry flavor"), 45);
        productRegister.put(new GlutenFreeProduct("soups", "vegetable broth, cubes"), 10);

        return productRegister;
    }

    private List<Client> createBlackList() {
        List<Client> blackList = new ArrayList<>();
        blackList.add(new Client("unName"));
        return blackList;
    }

    @Override
    public boolean process(Client client, Map<Product, Integer> productsOrders) {
        return (!blackList.contains(client) && isProductsAvailable(productsOrders));
    }

    private boolean isProductsAvailable(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry: productsOrders.entrySet()) {
            Optional<Integer> productQuantity = Optional.ofNullable(productRegister.get(entry.getKey()));
            if (productQuantity.orElse(0) < entry.getValue()) {
                System.out.println("We don't have this product now. We're working on this. Try another time.");
                return false;
            }
        }
        return true;
    }
}
