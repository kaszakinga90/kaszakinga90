package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    /*klasa obliczająca statystyki:
    - liczba użytkowników
    - liczba postów
    - iczba komentarzy
    - średnia liczba postów na użytkownika
    - średnia liczba komentarzy na użytkownika
    - średnia liczba komentarzy na post
     */

    /*
    Stworzona klasa powinna posiadać metodę
    calculateAdvStatistics(Statistics statistics), która obliczy
    podane powyżej wartości i zapamięta je we właściwościach (polach)
    klasy. Możesz również dopisać metodę showStatistics(), która
    wyświetli zapamiętane we właściwościach statystyki.
     */


    private int users;
    private int posts;
    private int comments;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public int getUsers() {
        return users;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        postsPerUser = calculatePostsPerUser();
        commentsPerUser = calculateCommentsPerUser();
        commentsPerPost = calculateCommentsPerPost();
    }

    private double calculatePostsPerUser() {
        if(users>0){
            return (double)posts/users;
        } else {
            return 0;
        }
    }

    private double calculateCommentsPerUser() {
         if(users>0){
             return (double)comments/users;
         } else {
             return 0;
         }
    }

    private double calculateCommentsPerPost() {
        if(posts>0){
            return (double)comments/posts;
        } else {
            return 0;
        }
    }

    public void showStatistics(){
        System.out.println("Numbers of forum users: " + users);
        System.out.println("Numbers of forum posts: " + posts);
        System.out.println("Numbers of forum comments: " + comments);
        System.out.println("Numbers of posts per user: " + postsPerUser);
        System.out.println("Numbers of comments per user: " + commentsPerUser);
        System.out.println("Numbers of comments per post: " + commentsPerPost);
    }
}


