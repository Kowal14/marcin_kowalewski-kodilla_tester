package com.kodilla.abstracts;

public abstract class Shape {
    int a;
    int b;
    int c;
    int h;

    public Shape(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public abstract void getArea();

    public abstract void getPerimeter();
}
