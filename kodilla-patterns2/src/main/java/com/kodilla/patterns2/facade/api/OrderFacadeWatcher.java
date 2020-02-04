package com.kodilla.patterns2.facade.api;

import com.kodilla.patterns2.aop.calculator.Watcher;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.stream.Collectors;

@Aspect
@Component
public class OrderFacadeWatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade..api.OrderFacade.processOrder(..))" + "&& args(order, userId) && target(object)")
    public void logEvent(OrderDto order, Long userId, Object object){
        LOGGER.info("Logging... starting method processOrder:\n" +
                "Class: " + object.getClass().getName() +
                "\nArgs: OrderDto: " + order.getItems().stream()
                .map(n->n.toString())
                .collect(Collectors.joining(",\n")) +
                "\nUserId: " + userId);
    }

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent() {
        LOGGER.info("\nLogging... starting method processOrder class OrderFacade...");
    }
}
