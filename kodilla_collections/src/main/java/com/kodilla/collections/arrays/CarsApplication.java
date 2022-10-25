package com.kodilla.collections.arrays;

import com.kodilla.collections.homework.Bmw;
import com.kodilla.collections.homework.Car;
import com.kodilla.collections.homework.Opel;
import com.kodilla.collections.homework.Ford;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() {
        int drawnCarKind = RANDOM.nextInt(3);
        int a = getRandomIncreaseSpeed();
        if (drawnCarKind == 0)
            return new Bmw(a);
        else if (drawnCarKind == 1)
            return new Opel(a);
        else {
            return new Ford(a);
    }

}
    private static int getRandomIncreaseSpeed() {
    return RANDOM.nextInt(10);
    }
}