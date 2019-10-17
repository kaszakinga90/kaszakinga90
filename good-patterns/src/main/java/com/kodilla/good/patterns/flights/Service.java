package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class Service {
    private AvlblFlight avlblFlight;

    public Service(AvlblFlight avlblFlight) {
        this.avlblFlight = avlblFlight;
    }

    public Set<Flight> availableFlightsFromCity(String departureAirport) {
        return avlblFlight.getAvailableFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> availableFlightsToCity(String arrivalAirport) {
        return avlblFlight.getAvailableFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<List<Flight>> availableMiddleFlights(String departureAirport, String arrivalAirport) {
        Set<List<Flight>> middleFlights = new HashSet<>();

        avlblFlight.getAvailableFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .forEach(flight -> {
                    List <Flight> xFlight = avlblFlight.getAvailableFlights().stream()
                            .filter(fl -> (flight.getArrivalAirport().equals(fl.getDepartureAirport()) && fl.getArrivalAirport().equals(arrivalAirport)))
                            .collect(Collectors.toList());

                    if (xFlight.size() > 0) {
                        List<Flight> direction = new ArrayList<>();
                        direction.add(flight);
                        direction.addAll(xFlight);
                        middleFlights.add(direction);
                    }
                });
        return middleFlights;
    }
}