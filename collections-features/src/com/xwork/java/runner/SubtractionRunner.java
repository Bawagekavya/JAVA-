package com.xwork.java.runner;

import com.xwork.java.interfaces.Subtraction;

public class SubtractionRunner {

    public static void main(String[] args) {

        Subtraction sub = (a, b) -> {

            return a-b;

        };

        int total = sub.sub(100,50);
        System.out.println("Addition of 100 from 50 : " + total );
    }
}
