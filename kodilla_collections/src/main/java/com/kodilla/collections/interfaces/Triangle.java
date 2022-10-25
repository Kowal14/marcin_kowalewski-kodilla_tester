package com.kodilla.collections.interfaces;

import com.kodilla.collections.interfaces.Shape;

public class Triangle implements Shape {

    double width;
    double height;
    double hypotenuse;

    public Triangle(double width, double height, double hypotenuse) {
        this.width = width;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return width * height / 2;
    }

    @Override
    public double getPerimeter() {
        return width + height + hypotenuse;
    }
}
