package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        // length * width
        double area = length * width;
        return area;
    }

    @Override
    public String getName() {
        String name = "Rectangle";
        return name;
    }

}
