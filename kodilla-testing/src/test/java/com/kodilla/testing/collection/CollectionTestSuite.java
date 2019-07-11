package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;
import java.lang.*;


public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Status: begin");
    }

    @After
    public void after(){
        System.out.println("Test Status: end");
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        Random theGenerator = new Random();
        for(int i=0; i<400; i++) {
            myArrayList.add(theGenerator.nextInt(100));
        };
        OddNumbersExterminator oddArray = new OddNumbersExterminator();
        //When
        Integer result = oddArray.exterminate();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(ArrayList<Integer> numbers, result);
    }

}
