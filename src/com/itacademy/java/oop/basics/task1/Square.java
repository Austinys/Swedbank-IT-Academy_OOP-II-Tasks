package com.itacademy.java.oop.basics.task1;

public class Square extends Shape {
    double side;

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }

    public Square(double side) {
        this.side = side;
    }

    public String toString() {
        return "Square area: " + calculateArea() + " perimeter:" + calculatePerimeter();

    }
}
