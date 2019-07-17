package com.kodilla.testing.collection;
import org.junit.*;
import java.util.*;
import java.lang.*;


public class CollectionTestSuite {
    private ArrayList<Integer> anotherList = new ArrayList<>();


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
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        numbers.size();

        OddNumbersExterminator oddArray = new OddNumbersExterminator();
        //When
        List<Integer> result = oddArray.exterminate(numbers);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(result, numbers);

    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddArray = new OddNumbersExterminator();
        //When
        List<Integer> result = oddArray.exterminate(numbers);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(result, numbers);

    }

}
