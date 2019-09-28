package com.kodilla.good.patterns.food2Door;

import java.util.List;

public class OrderService {

    public void processAllOrders(List<OrderRequest> orderRequest) {

        orderRequest.stream()
                .map(n -> {
                    System.out.println(n.getClient().getName() + " Starting realise order... ");
                    return n.getFoodProducer().process(n.getClient(), n.getProductOrderRequest());
                })
                .forEach(t -> System.out.println("Order is successfully realise: " + t + "\n"));
    }
}
