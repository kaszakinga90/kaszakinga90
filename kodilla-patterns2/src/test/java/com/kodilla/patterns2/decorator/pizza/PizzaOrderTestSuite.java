package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(10), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Your ordered pizza ", description);
    }

    @Test
    public void testBasicPizzaOrderWithExpressDeliveryGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExpressDeliveryDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Your ordered pizza + express delivery", description);
    }

    @Test
    public void testBasicPizzaOrderWithExpressDeliveryGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExpressDeliveryDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderWithChickenCheeseInTheEdgesDoubleSauceMushroomsBasicDeliveryGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new CheeseInTheEdgesDecorator(theOrder);
        theOrder = new DoubleSauceDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new BasicDeliveryDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Your ordered pizza + chicken + cheese in the edges + double sauce + mushrooms + delivery ", description);
    }

    @Test
    public void testBasicPizzaOrderWithChickenCheeseInTheEdgesDoubleSauceMushroomsBasicDeliveryGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new CheeseInTheEdgesDecorator(theOrder);
        theOrder = new DoubleSauceDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new BasicDeliveryDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(32.50), calculatedCost);
    }


}
