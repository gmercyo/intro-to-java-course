package com.cbfacademy.shapes;

public class Paint {
    public double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
        // coverage is the number of square feet per gallon this paint can cover
    }

    public double getAmount(Shape shape) {
        // return the amount of paint (measured in gallons) needed to paint a given
        // shape
        // String name = shape.getName();
        double area = shape.getArea();

        double paintVol = area / coverage;
        return paintVol;
    }
}
