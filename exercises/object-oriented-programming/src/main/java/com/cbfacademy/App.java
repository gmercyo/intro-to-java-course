package com.cbfacademy;

import java.util.List;

import com.cbfacademy.cars.Car;
import com.cbfacademy.cars.Showroom;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Showroom myShowroom = new Showroom();
        List<Car> myCars = myShowroom.getCars();
        for (Car car : myCars) {
            String details = car.getDetails();
            System.out.println(details);
        }
    
    }
}
