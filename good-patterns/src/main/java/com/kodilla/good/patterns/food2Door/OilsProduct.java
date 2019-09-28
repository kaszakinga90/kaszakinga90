package com.kodilla.good.patterns.food2Door;

public class OilsProduct extends Product {
    private boolean oil;

    public OilsProduct(String productName, boolean oil) {
        super(productName);
        this.oil = oil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        OilsProduct that = (OilsProduct) o;

        return oil == that.oil;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (oil ? 1 : 0);
        return result;
    }
}

