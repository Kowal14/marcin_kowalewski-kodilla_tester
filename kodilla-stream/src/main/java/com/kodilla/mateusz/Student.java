package com.kodilla.mateusz;

public class Student {
    private String name;
    private double weightInKg;
    private double heightInCm;

    public Student(String name, double weightInKg, double heightInCm) {
        this.name = name;
        this.weightInKg = weightInKg;
        this.heightInCm = heightInCm;
    }
    public String getName() {
        return name;
    }
    public double getWeightInKg() {
        return weightInKg;
    }
    public double getHeightInCm() {
        return heightInCm;
    }
}
