package com.kodilla;

import java.util.Objects;

public class FirstClass {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FirstClass)) return false;
        FirstClass that = (FirstClass) o;
        return Objects.equals(author, that.author) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "FirstClass{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    System.out.println("tekst");
}


