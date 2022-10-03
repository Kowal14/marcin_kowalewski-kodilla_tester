package com.kodilla.abstracts;

public abstract class Shape {
    int sideOfSquare;

    public Shape(int sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    public abstract void getArea();

    public abstract void getPerimeter();
}
