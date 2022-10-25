package com.kodilla.collections.homework;

public class Opel implements Car {
    int speed;

    public Opel(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 4;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed -3;

    }
}
