package com.kodilla.good.patterns.flights;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FlightsTestSuite {

    private static Service service;
    private static AvlblFlight avlblFlightMock;
    private static Set<Flight> availableFlights;

    @BeforeClass
    public static void beforeClass() {
        avlblFlightMock = mock(AvlblFlight.class);
        service = new Service(avlblFlightMock);
        availableFlights = new HashSet<>();
        availableFlights.add(new Flight("Warsaw", "Cracow"));
        availableFlights.add(new Flight("Cracow", "Rzeszow"));
        availableFlights.add(new Flight("Warsaw", "Lodz"));
        availableFlights.add(new Flight("Rzeszow", "Lodz"));
        availableFlights.add(new Flight("Rzeszow", "Cracow"));
        availableFlights.add(new Flight("Cracow", "Lodz"));
        availableFlights.add(new Flight("Warsaw", "Rzeszow"));
    }

    @Test
    public void availableFlightsFromCityTest() {
        //Given
        String departureAirport = "Cracow";
        Set<Flight> xList = new HashSet<>();
        xList.add(new Flight("Cracow", "Rzeszow"));
        xList.add(new Flight("Cracow", "Lodz"));
        //When
        when(avlblFlightMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<Flight> result = service.availableFlightsFromCity(departureAirport);
        //Then
        Assert.assertEquals(xList, result);
    }

    @Test
    public void noAvailableFlightsFromCityTest() {
        //Given
        String departureAirport = "Lodz";
        Set<Flight> xList = new HashSet<>();
        //When
        when(avlblFlightMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<Flight> result = service.availableFlightsFromCity(departureAirport);
        //Then
        Assert.assertEquals(xList, result);
    }

    @Test
    public void availableFlightsToCityTest() {
        //Given
        String arrivalAirport = "Rzeszow";
        Set<Flight> xList = new HashSet<>();
        xList.add(new Flight("Warsaw", "Rzeszow"));
        xList.add(new Flight("Cracow", "Rzeszow"));
        //When
        when(avlblFlightMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<Flight> result = service.availableFlightsToCity(arrivalAirport);
        //Then
        Assert.assertEquals(xList, result);
    }

    @Test
    public void noAvailableFlightsToTest() {
        //Given
        String arrivalAirport = "Warsaw";
        Set<Flight> xList = new HashSet<>();
        //When
        when(avlblFlightMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<Flight> result = service.availableFlightsToCity(arrivalAirport);
        //Then
        Assert.assertEquals(xList, result);
    }

    @Test
    public void availableMiddleFlightsTest() {
        //Given
        String departureAirport = "Warsaw";
        String arrivalAirport = "Lodz";
        Set<List<Flight>> xList = new HashSet<>();

        List<Flight> middleList1 = new ArrayList<>();
        middleList1.add(new Flight("Warsaw", "Cracow"));
        middleList1.add(new Flight("Cracow", "Lodz"));

        xList.add(middleList1);

        List<Flight> middleList2 = new ArrayList<>();
        middleList2.add(new Flight("Warsaw", "Rzeszow"));
        middleList2.add(new Flight("Rzeszow", "Lodz"));

        xList.add(middleList2);
        //When
        when(avlblFlightMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<List<Flight>> result = service.availableMiddleFlights(departureAirport, arrivalAirport);
        //Then
        Assert.assertEquals(xList, result);
    }

    @Test
    public void noAvailableMiddleFlightsTest() {
        //Given
        String departureAirport = "Lodz";
        String arrivalAirport = "Rzeszow";
        Set<List<Flight>> xList = new HashSet<>();

        //When
        when(avlblFlightMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<List<Flight>> result = service.availableMiddleFlights(departureAirport, arrivalAirport);
        //Then
        Assert.assertEquals(xList, result);
    }
}
