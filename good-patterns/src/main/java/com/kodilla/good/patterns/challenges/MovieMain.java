package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieMain {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movieList = movieStore.getMovies();
        String movies = movieList.entrySet().stream()
                .map(n -> n.getValue())
                .flatMap(n -> n.stream())
                .collect(Collectors.joining("!", "Movie titles from the store: ", ""));

        System.out.println(movies);
    }

}
