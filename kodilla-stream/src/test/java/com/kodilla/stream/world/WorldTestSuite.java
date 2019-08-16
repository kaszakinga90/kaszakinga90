package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent ntAmerica = new Continent("North America");
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        Country canada = new Country("Canada");
        Country mexico = new Country("Mexico");
        Country liechtenstein = new Country("Liechtenstein");
        Country netherlands = new Country("Netherlands");
        Country armenia = new Country("Armenia");
        Country indonesia = new Country("Indonesia");
        Country egypt = new Country("Egypt");
        Country algeria = new Country("Algeria");

        world.addContinent(ntAmerica);
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        ntAmerica.addCountry(canada);
        ntAmerica.addCountry(mexico);
        europe.addCountry(liechtenstein);
        europe.addCountry(netherlands);
        asia.addCountry(armenia);
        asia.addCountry(indonesia);
        africa.addCountry(egypt);
        africa.addCountry(algeria);

        //When
        BigDecimal everyoneOnTheWorld = world.getPeopleQuantity();

        //Then
        BigDecimal peopleOnTheWorldShouldBe = new BigDecimal("20790120");
        Assert.assertEquals(peopleOnTheWorldShouldBe, everyoneOnTheWorld);
    }


    //tu ma być testGetPeopleQuantity(), który sprawdzi czy metoda
    //getPeopleQuantity() klasy World działa ok
}
