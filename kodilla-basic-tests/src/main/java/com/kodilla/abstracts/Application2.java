package com.kodilla.abstracts;

public class Application2 {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3, 4, 5, 4);
        triangle.getArea();
        triangle.getPerimeter();

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.getArea();
        rectangle.getPerimeter();

        Square square = new Square(5);
        square.getArea();
        square.getPerimeter();
    }
}
