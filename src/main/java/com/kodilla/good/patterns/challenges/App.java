package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> moviesHashMap = movieStore.getMovies();

        String moviesList = moviesHashMap.values()
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining("!"));

        System.out.println(moviesList);
    }
}
