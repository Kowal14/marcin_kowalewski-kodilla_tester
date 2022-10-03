package com.kodilla.inheritance.homework;

public class Summary {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1999);
        operatingSystem.turnOnSystem();

        Linux linux = new Linux(1991);
        linux.turnOnSystem();

        Windows windows = new Windows(1985);
        windows.turnOffSystem();






    }
}
