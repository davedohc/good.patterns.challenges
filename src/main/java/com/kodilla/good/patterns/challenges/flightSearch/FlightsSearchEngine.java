package com.kodilla.good.patterns.challenges.flightSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsSearchEngine implements SearchEngine {
    private final DataBase dataBase;

    public FlightsSearchEngine(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getFlightsFrom(String flightFrom) {
        List<Flight> flightsFromResult = dataBase.getDataBase().stream()
                .filter(flight -> flight.getFlightFrom().equals(flightFrom))
                .collect(Collectors.toList());

        return new ResultDataBase(flightsFromResult);
    }

    public DataBase getFlightsTo(String flightTo) {
        List<Flight> flightsToResult = dataBase.getDataBase().stream()
                .filter(flight -> flight.getFlightTo().equals(flightTo))
                .collect(Collectors.toList());

        return new ResultDataBase(flightsToResult);
    }

    public DataBase getFlightsBy(String flightBy) {
        List<Flight> flightsFrom = getFlightsFrom(flightBy).getDataBase();
        List<Flight> flightsTo = getFlightsTo(flightBy).getDataBase();
        List<Flight> flightsThroughResult = new ArrayList<>();

        for (Flight directFlightFrom : flightsFrom) {
            for (Flight directFlightTo : flightsTo) {
                if (directFlightTo.getFlightTo().equals(directFlightFrom.getFlightFrom())) {
                    flightsThroughResult.add(new FlightBy(directFlightTo.getFlightFrom(), flightBy, directFlightFrom.getFlightTo()));
                }
            }
        }

        return new ResultDataBase(flightsThroughResult);
    }
}