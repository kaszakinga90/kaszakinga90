package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    public Shape shape;
    private ArrayList<Shape> figures = new ArrayList<>();

    public ShapeCollector(Shape shape){
        this.shape = shape;
    }

    void addFigure(Shape shape){
        figures.add(shape);
    }

    boolean removeFigure(Shape shape){
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    int getFigure(int n){
        return n;
    }

    int showFigures(){
        return figures.size();
    }
}
