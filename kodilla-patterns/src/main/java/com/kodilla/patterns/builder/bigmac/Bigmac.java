package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final ChooseRoll bun;
    private final int burgers;
    private final ChooseSauce sauce;
    private List<ChooseIngredients> ingredients;

    public static class BigmacBuilder {
        private ChooseRoll bun;
        private int burgers;
        private ChooseSauce sauce;
        private List<ChooseIngredients> ingredients = new ArrayList<>();

        public BigmacBuilder bun(ChooseRoll bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(ChooseSauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(ChooseIngredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bigmac(ChooseRoll bun, int burgers, ChooseSauce sauce, List<ChooseIngredients> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public ChooseRoll getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public ChooseSauce getSauce() {
        return sauce;
    }

    public List<ChooseIngredients> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                '}';
    }
}
