package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    void shouldReturnEmptyList() {
        FlightFinder flightFinder = new FlightFinder();
        assertEquals(0, flightFinder.findFlightsTo("Amsterdam").size());
    }
    @Test
    void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        assertEquals(1, flightFinder.findFlightsFrom("Pekin").size());
    }
    @Test
    void testFindFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        assertEquals(2, flightFinder.findFlightsTo("Moskwa").size());
    }
}


