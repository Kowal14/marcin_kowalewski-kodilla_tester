package com.kodilla.abstracts;

public class Triangle extends Shape {
    public Triangle(int a, int b, int c, int h) {
        super(3, 4, 5, 4);
    }

    @Override
    public void getArea() {
        int area;
        area = a * h * h;
        System.out.println(area);
    }
    @Override
    public void getPerimeter() {
        int perimeter;
        perimeter = a+b+c;
        System.out.println(perimeter);}
}