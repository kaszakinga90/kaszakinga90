package com.kodilla.testing.shape;

import org.junit.*;


import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;


public class ShapeCollectorTestSuite {

    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    //testy sprawdzające metody klasy ShapeCollector
    /*

    @Test
    public void testAddFigure() {
        //Given
        Shape circle = new Circle();
        ShapeCollector collector = new ShapeCollector(circle);

        //When
        collector.addFigure(circle);

        //Then
        Assert.assertEquals(circle, collector.getShapeName());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ArrayList<Shape> figures = new ArrayList<>();
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(circle);
        collector.addFigure(square);
        collector.addFigure(triangle);

        //When
        List<String> result = collector.remove(circle);
        System.out.println("Testing " + result);

        //Then
        Assert.assertEquals(result, figures);
    }

    @Test
    public void testGetFigure() {
        //Given
        ArrayList<Shape> figures = new ArrayList<>();
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(circle);
        collector.addFigure(square);
        collector.addFigure(triangle);

        //When
        List<String> result = collector.get(1);
        System.out.println("Testing " + result);

        //Then
        Assert.assertEquals(result, figures.get(1));
    }

    @Test
    public void testShowFigures() {
        //Given
        ArrayList<Shape> figures = new ArrayList<>();
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(circle);
        collector.addFigure(square);
        collector.addFigure(triangle);

        //When
        int result = figures.size();
        System.out.println("Testing " + result);

        //Then
        Assert.assertEquals(result, figures.size());
    }

*/

}
