package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){

        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookA = new HashSet<>();
        bookA.add(new Book("J.R.R. Tolkien",
                "Lord of The Rings",
                1985,
                "9788328713215"));
        bookA.add(new Book("Robert Jordan",
                "Smok Odrodzony",
                1993,
                "9788375069396"));
        bookA.add(new Book("Andrzej Pilipiuk",
                "Kroniki Jakuba Wędrowicza",
                2014,
                "9788379640003"));
        bookA.add(new Book("Brandon Sanderson",
                "Droga Królów",
                2010,
                "9788374804219"));
        bookA.add(new Book("Dean Brown",
                "Cyfrowa twierdza",
                2016,
                "9788379996919"));

        //When
        int median = medianAdapter.publicationYearMedian(bookA);

        //Then
        Assert.assertEquals(2010, median);

    }
}
