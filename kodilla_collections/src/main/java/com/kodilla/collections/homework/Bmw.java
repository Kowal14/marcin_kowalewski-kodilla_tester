package com.kodilla.collections.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Bmw{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bmw bmw = (Bmw) o;
        return speed == bmw.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
