package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
/*
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
*/


public class StreamMain {
    public static void main(String[] args) {

        /*
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

         */

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String beautyWords = poemBeautifier.beautify("I need words to beautify", (text -> text.toUpperCase()));
        System.out.println(beautyWords);

        String beautyWords2 = poemBeautifier.beautify("I need words to beautify", (text -> text + "ABC"));
        System.out.println(beautyWords2);

        String beautyWords3 = poemBeautifier.beautify("I need words to beautify", (text -> "ABC" + text));
        System.out.println(beautyWords3);

        String beautyWords4 = poemBeautifier.beautify("I need words to beautify", (text -> text.replace("I", "---")));
        System.out.println(beautyWords4);

        String beautyWords5 = poemBeautifier.beautify("I need words to beautify", (text -> text.length() + " for example - expression: " + text));
        System.out.println(beautyWords5);

    }
}