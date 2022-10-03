package com.kodilla.abstracts;

public class Square1 extends Shape {
    public Square1(int sideOfSquare) {
        super(5);
    }
    @Override
    public void getArea() {
    System.out.println("Area of Square1 = 25");
    }
    @Override
    public void getPerimeter() {
    System.out.println("Perimeter of Square1 = 20");}
}
