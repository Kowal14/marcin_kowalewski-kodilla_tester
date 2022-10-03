package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    public Linux(int origin) {
        super(origin);
    }
    @Override
    public void turnOnSystem() {
        System.out.println("System is turning on and showing logo on the desktop");
    }
}
