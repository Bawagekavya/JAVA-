package com.xwork.java.implement;

import com.xwork.java.internal.Shape;

public class ShapeImpl implements Shape {

    @Override
    public void draw() {
        System.out.println("drawing in ShapeImpl");
    }

    @Override
    public double Area() {
        System.out.println("Area in ShapeImpl");
        return 76.09;

    }
}
