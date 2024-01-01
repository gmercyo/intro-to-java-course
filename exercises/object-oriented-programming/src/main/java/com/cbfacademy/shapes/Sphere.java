package com.cbfacademy.shapes;

public class Sphere extends Shape {
    public double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // 4 * pi * radius * radius
        double area = 4 * Math.PI * radius * radius;
        return area;
    }

    @Override
    public String getName() {
        String name = "Sphere";
        return name;
    }

}
