package com.kodilla.abstracts;

public class Person {

    String firstName;
    int age;
    String job;
    private Mechanic mechanic;

    public Person(String firstName, int age, String job, Mechanic mechanic) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
        this.mechanic = mechanic;
    }

    public void main(String[] args) {
        System.out.println(mechanic.responsibilities);
    }
}








