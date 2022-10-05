package com.kodilla.abstracts;

public class Rectangle extends Shape{
    public Rectangle(int a, int b) {
        super(4,6, 0, 0);
    }
    @Override
    public void getArea() {
    int area;
    area = a*b;
    System.out.println(area);
    }
    @Override
    public void getPerimeter() {
    int perimeter;
    perimeter = 2*a + 2*b;
    System.out.println(perimeter);}
}
