package com.kodilla.abstracts;

public class Person {

    String firstName;
    int age;
    String job;


    public Person(String firstName, int age, String job, Mechanic mechanic) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;

    }

    public static void main(String[] args) {
        Mechanic mechanic = new Mechanic(1000, "repairCar");

        System.out.println(mechanic.responsibilities);
    }
}








