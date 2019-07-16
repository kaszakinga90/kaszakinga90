package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(ArrayList<Integer> numbers){
        int temporaryValue;
        for(int i=0; i<numbers.size(); i++){
            temporaryValue = numbers.get(i);

            if (temporaryValue % 2 == 0) {
                System.out.println(temporaryValue);
            }
        }
        return numbers;
    }
}