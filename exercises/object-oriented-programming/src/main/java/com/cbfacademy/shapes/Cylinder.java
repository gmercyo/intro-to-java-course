package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    public double radius;
    public double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        // height * Math.PI * radius * radius
        double area = height * Math.PI * radius * radius;
        return area;
    }

    @Override
    public String getName() {
        String name = "Cylinder";
        return name;
    }
}
