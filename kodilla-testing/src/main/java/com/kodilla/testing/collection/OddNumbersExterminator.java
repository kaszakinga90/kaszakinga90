package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public int exterminate(ArrayList<Integer> numbers){
        int temporaryValue;
        for(int i=0; i<numbers.size(); i++){
            temporaryValue = numbers.get(i);

            if (temporaryValue % 2 == 0) {
                System.out.println(temporaryValue);
            }
        }
        return numbers.size();
    }
}