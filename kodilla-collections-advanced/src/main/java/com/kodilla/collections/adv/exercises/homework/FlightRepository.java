package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Moskwa"));
        flights.add(new Flight("Paryż", "Madryt"));
        flights.add(new Flight("Moskwa", "Pekin"));
        flights.add(new Flight("Berlin", "Warszawa"));
        flights.add(new Flight("Madryt", "Moskwa"));
        flights.add(new Flight("Pekin", "Paryż"));
        return flights;
    }

}
