package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int origin;

    public OperatingSystem(int origin) {
        this.origin = origin;
        System.out.println(" Year of origin : " + origin);
    }

    public void turnOnSystem() {
        System.out.println("System is turning on");
    }
    public void turnOffSystem() {
        System.out.println("System is turning off");
    }
}
