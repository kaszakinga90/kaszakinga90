package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    private ArrayList<Integer> numbers = new ArrayList<>();

    public int exterminate(ArrayList<Integer> numbers){
        int temporaryValue = 0;
        for(int i=0; i<numbers.size(); i++){
            temporaryValue = numbers.get(i);

            if (temporaryValue % 2 == 0) {
                System.out.println(temporaryValue);
            }
        }
        return numbers.size();
    }
}