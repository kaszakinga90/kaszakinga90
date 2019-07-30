package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;



public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> usersMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> Period.between(forumUser.getBirthdate(), LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser -> ForumUser));

        usersMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": "+ entry.getValue())
                .forEach(System.out::println);




        /* do treści 7.3

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);
*/
/* do treści 7.3
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);
*/
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

        /* zadanie 7.1

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

        */

        /* zadanie 7.2

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
        */


    }
}