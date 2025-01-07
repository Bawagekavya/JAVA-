package com.xwork.java.runner;

import com.xwork.java.interfaces.Shape;

public class ShapeRunner {

    public static void main(String[] args) {

        Shape area = (a) -> {

            return a * a;

        };
        double squarearea = area.calSquareArea(10);
        System.out.println("Area of square : " + squarearea);
    }
}
