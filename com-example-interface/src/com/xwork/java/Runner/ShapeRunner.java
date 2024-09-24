package com.xwork.java.Runner;

import com.xwork.java.implement.ShapeImpl;

public class ShapeRunner {

    public static void main(String[] args) {

        ShapeImpl shapeImpl = new ShapeImpl();
        shapeImpl.draw();
        System.out.println("Area :" + shapeImpl.Area());
    }
}
