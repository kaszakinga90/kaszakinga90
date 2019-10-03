package com.kodilla.spring.calculator;

import com.kodilla.spring.library.Library;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double resultOfAdd = calculator.add(4, 2);
        double resultOfSub = calculator.sub(12, 3);
        double resultOfMul = calculator.mul(1, 9);
        double resultOfDiv = calculator.div(6, 2);

        //Then
        Assert.assertEquals(6, resultOfAdd, 0.01);
        Assert.assertEquals(9, resultOfSub, 0.01);
        Assert.assertEquals(9, resultOfMul, 0.01);
        Assert.assertEquals(3, resultOfDiv, 0.01);
    }
}
