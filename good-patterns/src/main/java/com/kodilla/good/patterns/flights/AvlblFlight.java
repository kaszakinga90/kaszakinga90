package com.kodilla.good.patterns.flights;

import java.util.Set;

public class AvlblFlight {
    private Set<Flight> availableFlights;

    public AvlblFlight(Set<Flight> availableFlights) {
        this.availableFlights = availableFlights;
    }

    public AvlblFlight() {
    }

    public Set<Flight> getAvailableFlights() {
        return availableFlights;
    }
}
