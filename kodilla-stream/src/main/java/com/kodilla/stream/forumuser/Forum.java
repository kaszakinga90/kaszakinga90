package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1, "Kaznodzieja", 'M', LocalDate.of(1981, Month.JULY, 30), 5));
        usersList.add(new ForumUser(2, "Goliat", 'M', LocalDate.of(1999, Month.JUNE, 15), 32));
        usersList.add(new ForumUser(3, "Rebecca", 'F', LocalDate.of(2003, Month.AUGUST, 8), 18));
        usersList.add(new ForumUser(4, "Voldemort", 'M', LocalDate.of(2000, Month.JANUARY, 2), 23));
        usersList.add(new ForumUser(5, "Oink", 'F', LocalDate.of(1987, Month.JULY, 26), 0));
        usersList.add(new ForumUser(6, "Betty78", 'F', LocalDate.of(1979, Month.SEPTEMBER, 27), 14));
        usersList.add(new ForumUser(7, "MyHero", 'F', LocalDate.of(2003, Month.DECEMBER, 18), 2));
        usersList.add(new ForumUser(8, "IAmGod", 'M', LocalDate.of(2002, Month.AUGUST, 5), 45));
        usersList.add(new ForumUser(9, "blueSquad", 'M', LocalDate.of(2000, Month.MAY, 6), 32));
        usersList.add(new ForumUser(10, "jjara", 'F', LocalDate.of(1996, Month.NOVEMBER, 1), 8));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(usersList);
    }



    /*

    W tym samym pakiecie napisz klasę Forum, która będzie
    zawierała listę użytkowników, czyli listę obiektów ForumUser.

    Klasa Forum powinna udostępniać metodę getUserList(),
    która będzie zwracała kolekcję z użytkownika forum
     */


}
