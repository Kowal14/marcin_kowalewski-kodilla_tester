package com.kodilla.collections.homework;

public class Bmw implements Car {
    int speed;


    public Bmw(int speed) {
        this.speed = speed;

    }
     public int getSpeed() {

        return speed;
    }
    public void increaseSpeed() {

        speed = speed + 3;
    }
    public void decreaseSpeed() {

        speed = speed - 2;
    }
}
