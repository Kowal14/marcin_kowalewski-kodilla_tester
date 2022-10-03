package com.kodilla.abstracts;

public class Application2 {
    public static void main(String[] args) {

        Square1 square1 = new Square1(5);
        square1.getArea();
        square1.getPerimeter();

        Square2 square2 = new Square2(10);
        square2.getArea();
        square2.getPerimeter();

        Square3 square3 = new Square3(15);
        square3.getArea();
        square3.getPerimeter();
    }
}
