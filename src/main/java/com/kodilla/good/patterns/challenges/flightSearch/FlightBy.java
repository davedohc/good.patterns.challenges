package com.kodilla.good.patterns.challenges.flightSearch;

public class FlightBy implements Flight {
    private final String flightFrom;
    private final String flightTrough;
    private final String flightTo;

    public FlightBy(String flightFrom, String flightTrough, String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTrough = flightTrough;
        this.flightTo = flightTo;
    }

    @Override
    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightBy() {
        return flightTrough;
    }

    @Override
    public String getFlightTo() {
        return flightTo;
    }

    @Override
    public String toString() {
        return "FlightBy{" +
                "flightFrom='" + flightFrom + '\'' +
                ", flightBy='" + flightTrough + '\'' +
                ", flightTo='" + flightTo + '\'' +
                '}';
    }
}
