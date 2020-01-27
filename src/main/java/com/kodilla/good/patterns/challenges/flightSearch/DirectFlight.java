package com.kodilla.good.patterns.challenges.flightSearch;

public class DirectFlight implements Flight {
    private final String flightFrom;
    private final String flightTo;

    public DirectFlight(String flightFrom, String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public String getFlightBy() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DirectFlight directFlight = (DirectFlight) o;

        if (flightFrom != null ? !flightFrom.equals(directFlight.flightFrom) : directFlight.flightFrom != null) return false;
        return flightTo != null ? flightTo.equals(directFlight.flightTo) : directFlight.flightTo == null;
    }

    @Override
    public int hashCode() {
        int result = flightFrom != null ? flightFrom.hashCode() : 0;
        result = 31 * result + (flightTo != null ? flightTo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightFrom='" + flightFrom + '\'' +
                ", flightTo='" + flightTo + '\'' +
                '}';
    }
}
