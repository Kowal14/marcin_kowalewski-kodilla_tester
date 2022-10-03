package com.kodilla.abstracts;

public class Square2 extends Shape {
    public Square2(int sideOfSquare) {
        super(10);
    }

    @Override
    public void getArea() {
        System.out.println("Area of Square2 = 100");
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of Square2 = 40");
    }
}
