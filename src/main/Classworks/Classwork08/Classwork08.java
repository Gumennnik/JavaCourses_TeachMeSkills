package Classwork08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Classwork08 {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(new Car("Audi", 27500, 250));
        cars.add(new Car("BMW", 29000, 280));
        cars.add(new Car("Honda", 18000, 220));

        System.out.println(cars);

        Car fastestCar = cars.get(0);

        cars.forEach(car -> {
            if (car.getMaxSpeed() >= fastestCar.getMaxSpeed()) {
                fastestCar.setMark(car.getMark());
                fastestCar.setPrice(car.getPrice());
                fastestCar.setMaxSpeed(car.getMaxSpeed());
            }
        });

        cars.clone();

        System.out.println("Fastest car is " + fastestCar);

        Collections.sort(cars);

        System.out.println(cars);


    }
}
