package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String nameOfCountry;
    private final BigDecimal peopleQuantity;

    public Country(final String nameOfCountry, final BigDecimal peopleQuantity) {
        this.nameOfCountry = nameOfCountry;
        this.peopleQuantity = peopleQuantity;
    }

    public Country(final String nameOfCountry) {
        this(nameOfCountry, new BigDecimal("2598765"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        if (nameOfCountry != null ? !nameOfCountry.equals(country.nameOfCountry) : country.nameOfCountry != null)
            return false;
        return peopleQuantity != null ? peopleQuantity.equals(country.peopleQuantity) : country.peopleQuantity == null;
    }

    @Override
    public int hashCode() {
        int result = nameOfCountry != null ? nameOfCountry.hashCode() : 0;
        result = 31 * result + (peopleQuantity != null ? peopleQuantity.hashCode() : 0);
        return result;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
