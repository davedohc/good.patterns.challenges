package com.kodilla.good.patterns.challenges.flightSearch;

import java.util.ArrayList;
import java.util.List;

public class FlightsDataBase implements DataBase {
    private final List<Flight> flightsDataBase = new ArrayList<>();

    public FlightsDataBase() {
        flightsDataBase.add(new DirectFlight("Gdansk", "Krakow"));
        flightsDataBase.add(new DirectFlight("Gdansk", "Wroclaw"));
        flightsDataBase.add(new DirectFlight("Warszawa", "Poznan"));
        flightsDataBase.add(new DirectFlight("Poznan", "Lodz"));
        flightsDataBase.add(new DirectFlight("Lodz", "Szczecin"));
        flightsDataBase.add(new DirectFlight("Szczecin", "Gdansk"));
        flightsDataBase.add(new DirectFlight("Gdansk", "Warszawa"));
        flightsDataBase.add(new DirectFlight("Lodz", "Poznan"));
        flightsDataBase.add(new DirectFlight("Rzeszow", "Krakow"));
        flightsDataBase.add(new DirectFlight("Gdansk", "Szczecin"));
        flightsDataBase.add(new DirectFlight("Krakow", "Szczecin"));
        flightsDataBase.add(new DirectFlight("Krakow", "Gdansk"));
    }

    @Override
    public void addToDataBase(Flight flight) {
        flightsDataBase.add(flight);
    }

    @Override
    public void removeFromDataBase(Flight flight) {
        flightsDataBase.remove(flight);
    }

    public List<Flight> getDataBase() {
        return new ArrayList<>(flightsDataBase);
    }

    @Override
    public void displayDataBase() {
        for (Flight flight : flightsDataBase) {
            System.out.println(flight);
        }
    }
}
