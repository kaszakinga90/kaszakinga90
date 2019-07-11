package com.kodilla.testing.collection;

public class OddNumbersExterminator {
    public void exterminate(ArrayList<Integer> numbers){
        int temporaryValue = 0;
        for(int i=0; i<numbers.size(); i++){
            temporaryValue = numbers.get(i);

            if (temporaryValue % 2 == 0) {
                System.out.println(temporaryValue);
            }
        }
    }
}