package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;


public class Showroom {
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        // Car volvo = new Car("Volvo", "V40", "blue", 2012);
        cars.add(new Car("Volvo", "V40", "Blue", 2012));
        cars.add(new Car("Porsche", "Panamera", "Red", 2009));
        cars.add(new Car("Audi", "A3", "Grey", 2018));

        return cars;
    }
}

