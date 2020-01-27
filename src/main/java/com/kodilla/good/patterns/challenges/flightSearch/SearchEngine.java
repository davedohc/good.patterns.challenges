package com.kodilla.good.patterns.challenges.flightSearch;

public interface SearchEngine {
    DataBase getFlightsFrom(String flightFrom);

    DataBase getFlightsTo(String flightTo);

    DataBase getFlightsBy(String flightThrough);
}
