package com.kodilla.good.patterns.challenges.flightSearch;

public class App {
    public static void main(String[] args) {
        DataBase flightsDataBase = new FlightsDataBase();
        SearchEngine flightsSearchEngine = new FlightsSearchEngine(flightsDataBase);

        DataBase flightsFromKrakow = flightsSearchEngine.getFlightsFrom("Krakow");
        DataBase flightsToLodz = flightsSearchEngine.getFlightsTo("Lodz");
        DataBase flightsToKrakow = flightsSearchEngine.getFlightsTo("Krakow");

        DataBase flightsByKrakow = flightsSearchEngine.getFlightsBy("Poznan");
        flightsByKrakow.displayDataBase();
        flightsFromKrakow.displayDataBase();
        flightsToKrakow.displayDataBase();
        flightsToLodz.displayDataBase();

    }
}
