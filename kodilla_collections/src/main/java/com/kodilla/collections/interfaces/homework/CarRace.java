package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Bmw bmw = new Bmw(70);
        Opel opel = new Opel(60);
        Ford ford = new Ford(55);
        doRace(bmw);
        doRace(opel);
        doRace(ford);
    }
    public static void doRace (Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }



}
