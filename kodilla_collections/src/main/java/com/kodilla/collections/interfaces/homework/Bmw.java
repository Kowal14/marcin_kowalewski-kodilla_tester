package com.kodilla.collections.interfaces.homework;

public class Bmw implements Car{
    int speed;
    int acceleration;
    int braking;

    public Bmw( int speed, int acceleration, int braking) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.braking = braking;
    }
     public int getSpeed() {

        return speed;
    }
    public int increaseSpeed() {

        return speed + acceleration;
    }
    public int decreaseSpeed() {

        return speed - braking;
    }
}
