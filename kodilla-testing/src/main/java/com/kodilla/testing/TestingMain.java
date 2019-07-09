package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int wynik1 = calculator.addAToB(3,8);
        System.out.println(wynik1);

        int wynik2 = calculator.substractAFromB(6,2);
        System.out.println(wynik2);

        System.out.println("Test - pierwszy test jednostkowy:");
    }
}
