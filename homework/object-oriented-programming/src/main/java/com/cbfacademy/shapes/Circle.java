package com.cbfacademy.shapes;

public class Circle implements Enclosure{
    // Declaring radius as an instance variable
    private double radius;

    // The constructor to initialise the Circle with a radius
    public Circle(double radius) {
        this.radius = radius;
    }
    // public double getRadius() {
    //     return radius;
    // }
    // public void setRadius(double radius) {
    //     this.radius = radius;
    // }
    @Override
    public double perimeter() {
        // calculating the perimeter (circumfrence) for the circle)
        return 2 * Math.PI * radius;
    }
    @Override
    public double area() {
        // Calculate the area of the circle
        return  Math.PI * radius * radius;
    }
    
}
