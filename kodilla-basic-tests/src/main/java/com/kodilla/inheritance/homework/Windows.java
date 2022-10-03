package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int origin) {
        super(origin);
    }
    @Override
    public void turnOffSystem() {
        System.out.println("System is turning off and playing closing theme");
    }

}
