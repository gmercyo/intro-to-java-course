package com.cbfacademy.shapes;

import java.util.ArrayList;

public class Shapes {
    
    public static double computeArea(ArrayList<Enclosure> enclosures) {
        double areaSum = 0;
        for (Enclosure e : enclosures) {
            areaSum += e.area();
        }
        return areaSum;
    }
    public static double computePerimeter(ArrayList<Enclosure> enclosures) {
        double perimeterSum = 0;
        for (Enclosure e : enclosures) {
            perimeterSum += e.perimeter();
        }
        return perimeterSum;
    }
    public static void main(String[] args) {
        ArrayList <Enclosure> enclosureShapes = new ArrayList<>();
        enclosureShapes.add(
            new Square(20)
        );
        enclosureShapes.add(new Square(4));
        enclosureShapes.add(new Square(12));
        enclosureShapes.add(new Circle(15));
        enclosureShapes.add(new Circle(10));
        enclosureShapes.add(new Circle(5));
        System.out.println(computeArea(enclosureShapes));
        System.out.println(computePerimeter(enclosureShapes));


}

}
