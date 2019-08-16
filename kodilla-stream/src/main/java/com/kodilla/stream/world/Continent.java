package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> continentsWithCountries = new ArrayList<>();
    private final String nameOfContinent;

    public Continent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public List<Country> getContinentsWithCountries() {
        return new ArrayList<>(continentsWithCountries);
    }

    public boolean addCountry(Country country) {
        return continentsWithCountries.add(country);
    }
}
