package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> worldsContinents = new ArrayList<>();

    public void addContinent(Continent continent) {
        worldsContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleOnTheWorld = worldsContinents.stream()
                .flatMap(continent -> continent.getContinentsWithCountries().stream())
                .distinct()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,country) -> sum.add(country));

        return peopleOnTheWorld;
    }
}
