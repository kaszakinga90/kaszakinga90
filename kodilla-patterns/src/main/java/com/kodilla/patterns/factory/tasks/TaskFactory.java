package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy a new books for children", "books", 5.0);
            case PAINTING:
                return new PaintingTask("Painting", "light grey", "walls");
            case DRIVING:
                return new DrivingTask("Go to the city", "pharmacy", "bus Marcel");
            default:
                return null;
        }

    }
}
