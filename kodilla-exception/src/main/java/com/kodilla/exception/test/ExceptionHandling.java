package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "It's not possible!";

        try {
            result = secondChallenge.probablyIWillThrowException(3.8, 2.8);
        } catch (Exception e) {
            System.out.println("Reason: " + e);
        } finally {
            System.out.println(result);
        }
    }
}
