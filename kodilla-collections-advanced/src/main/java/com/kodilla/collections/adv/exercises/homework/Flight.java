package com.kodilla.collections.adv.exercises.homework;

public class Flight {
    private String departure;
    private String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }
    public String getArrival() {
        return arrival;
    }
    public String getDeparture() {
        return departure;
    }
}