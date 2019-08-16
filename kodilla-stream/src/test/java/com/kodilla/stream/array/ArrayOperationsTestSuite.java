package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //Given
        int numbers [] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        double averageShouldBe = 4.05;

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(averageShouldBe, average, 0.0001);


        //Test powinien przygotować tablicę z przykładowymi wartościami typu int
        // i wywołać metodę getAverage(int[] numbers) interfejsu ArrayOperations
        //Przy pomocy asercji sprawdź, czy obliczona średnia jest poprawna
    }
}
