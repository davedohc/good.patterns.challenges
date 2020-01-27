package com.kodilla.good.patterns.challenges.flightSearch;

import java.util.List;

public interface DataBase {
    void addToDataBase(Flight flight);

    void removeFromDataBase(Flight flight);

    void displayDataBase();

    List<Flight> getDataBase();
}
