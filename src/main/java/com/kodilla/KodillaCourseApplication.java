package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class KodillaCourseApplication {

    public static void main(String[] args) {
        /*SpringApplication.run(KodillaCourseApplication.class, args);*/

        LinkedList<Book> theList = new LinkedList<Book>();

        System.out.println(theList.size());

    }


}