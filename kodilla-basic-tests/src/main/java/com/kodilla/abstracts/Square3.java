package com.kodilla.abstracts;

public class Square3 extends Shape {
    public Square3(int sideOfSquare) {
        super(15);
    }

    @Override
    public void getArea() {
        System.out.println("Area of Square3 = 225");
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of Square3 = 60");
    }
}
