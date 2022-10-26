package com.kodilla.collections.lists.homework;

import com.kodilla.collections.homework.Bmw;
import com.kodilla.collections.homework.Car;
import com.kodilla.collections.homework.Ford;
import com.kodilla.collections.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Bmw(70));
        cars.add(new Opel(60));
        cars.add(new Ford(55));

        cars.remove(2);

        Opel opel = new Opel(60);
        cars.remove(opel);

        System.out.println(cars.size());
        for (Car car : cars) {
            System.out.println(car + ", speed:" + car.getSpeed());


        }
    }
}
