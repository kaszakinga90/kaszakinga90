package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userId;
    private final String name;
    private final char sex;
    private final LocalDate birthDate;
    private final int posts;

    public ForumUser(int userId, String name, char sex, LocalDate birthDate, int posts) {
        this.userId = userId;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.posts = posts;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthDate;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthDate +
                ", posts=" + posts +
                '}';
    }
}
