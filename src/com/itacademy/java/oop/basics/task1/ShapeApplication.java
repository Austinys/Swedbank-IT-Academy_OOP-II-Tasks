package com.itacademy.java.oop.basics.task1;

import java.util.Scanner;

public class ShapeApplication {
    public static void main(String[] args) {

        Shape square = new Square(2);
        Shape circle = new Circle(4);


        System.out.println(circle.toString());
        System.out.println(square.toString());

    }
}
