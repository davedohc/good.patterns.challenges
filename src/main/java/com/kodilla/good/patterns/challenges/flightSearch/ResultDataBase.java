package com.kodilla.good.patterns.challenges.flightSearch;

import java.util.ArrayList;
import java.util.List;

public class ResultDataBase implements DataBase {
    private final List<Flight> resultDataBase;

    public ResultDataBase(List<Flight> resultDataBase) {
        this.resultDataBase = new ArrayList<>(resultDataBase);
    }

    public void addToDataBase(Flight flight) {
        resultDataBase.add(flight);
    }

    @Override
    public void removeFromDataBase(Flight flight) {
        resultDataBase.remove(flight);
    }

    public List<Flight> getDataBase() {
        return new ArrayList<>(this.resultDataBase);
    }

    public void displayDataBase() {
        for (Flight flight : resultDataBase) {
            System.out.println(flight);
        }
    }
}
