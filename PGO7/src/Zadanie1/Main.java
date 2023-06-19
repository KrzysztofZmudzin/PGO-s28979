package Zadanie1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car>cars= new ArrayList<>();

        cars.add(new Car("Car1", 2010));
        cars.add(new Car("Car2", 2015));
        cars.add(new Car("Car3", 2012));
        cars.add(new Car("Car4", 2018));
        cars.add(new Car("Car5", 2016));
        cars.add(new Car("Car6", 2014));
        cars.add(new Car("Car7", 2017));
        cars.add(new Car("Car8", 2013));
        cars.add(new Car("Car9", 2019));
        cars.add(new Car("Car10", 2011));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println("Model: " + car.getName() + ", Rok produkcji: " + car.getProductionYear());
        }
    }
}
