package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {

    private final Map<String, Boolean> mapOfAirports;

    public SearchFlight() {
        mapOfAirports = airportData();
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());
    }

    private boolean findAirport(String airportName) throws RouteNotFoundException{
        if (mapOfAirports.containsKey(airportName)) {
            return mapOfAirports.get(airportName);
        } else {
            throw new RouteNotFoundException("No airport!");
        }
    }

    private Map<String, Boolean> airportData() {
        Map<String, Boolean> airportData = new HashMap<>();
        airportData.put("New York", true);
        airportData.put("Moscow", true);
        airportData.put("New Delhi", false);
        airportData.put("Oslo", false);

        return airportData;
    }
}
