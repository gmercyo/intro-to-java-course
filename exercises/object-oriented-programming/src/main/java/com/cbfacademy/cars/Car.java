package com.cbfacademy.cars;

public class Car {
    // private member variable 'make'
    private String make;
    private String model;
    private String colour;
    private int year;
    

    // This a a constructor that accepts the parameters representing the make, model, colour, and year of the car
    public Car(String make, String model, String colour, int year) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
       this.colour = colour;
    }
    public String getDetails() {
        // To be able to return both a String and an Int, concatenate the make, model, colour, and year into a single String
        String details = "Make: " + make + ", Model: " + model + ", Colour: " + colour + ", Year: " + year;
        return details;
    }
    

}
