package com.kodilla.abstracts;

public class Square extends Shape{
    public Square(int a) {
        super(5,0,0,0);
    }
    @Override
    public void getArea() {
        int area;
        area =a*a;
        System.out.println(area);
    }
    @Override
        public void getPerimeter() {
        int perimeter;
        perimeter = 4*a;
        System.out.println(perimeter);}
}