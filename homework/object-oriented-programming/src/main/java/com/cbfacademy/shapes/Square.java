package com.cbfacademy.shapes;

public class Square implements Enclosure {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double perimeter() {
        return 4 * length;
    }
    @Override
    public double area() {
        return length * length;
    }
}
