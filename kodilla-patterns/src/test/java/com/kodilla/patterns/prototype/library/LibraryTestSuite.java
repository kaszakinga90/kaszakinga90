package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("KingaLibrary");
        Book book1 = new Book("Lord of the Rings", "J.R.R. Tolkien", LocalDate.of(1954, Month.JULY, 29));
        Book book2 = new Book("Wiedźmin. Stories", "A. Sapkowski", LocalDate.of(1989, Month.DECEMBER, 13));
        Book book3 = new Book("Umorzenie", "R. Mróz", LocalDate.of(2017, Month.JANUARY, 3));
        Book book4 = new Book("Wieża do nieba", "J. Piekara", LocalDate.of(2014, Month.NOVEMBER, 22));
        Book book5 = new Book("Narrenturum", "A. Sapkowski", LocalDate.of(2013, Month.MARCH, 31));
        Book book6 = new Book("Klient", "J. Grisham", LocalDate.of(1998, Month.MAY, 28));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Shallow copy of KingaLibrary");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep copy of KingaLibrary");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.removeBook(book2);

        //Then
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(6, deepClonedLibrary.getBooks().size());
    }
}
