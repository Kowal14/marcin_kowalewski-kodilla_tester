package com.kodilla.collections.interfaces.arrays;

import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("----------------------");
        System.out.println("Car kind :" + getCarName(car));
        System.out.println("Car speed :" + car.getSpeed());

    }
    private static String getCarName(Car car) {
        if(car instanceof Bmw)
            return "Bmw";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Ford)
            return "Ford";
        else
            return "Unknown car name";
            
        }
    }
