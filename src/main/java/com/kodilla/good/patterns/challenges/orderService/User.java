package com.kodilla.good.patterns.challenges.orderService;

public class User {
    private final String name;
    private final String surname;
    private final long telNumber;
    private final String address;

    public User(String name, String surname, long telNumber, String address) {
        this.name = name;
        this.surname = surname;
        this.telNumber = telNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getTelNumber() {
        return telNumber;
    }

    public String getAddress() {
        return address;
    }
}
