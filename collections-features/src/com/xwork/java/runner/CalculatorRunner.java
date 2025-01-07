package com.xwork.java.runner;

import com.xwork.java.interfaces.Calculator;

public class CalculatorRunner {

    public static void main(String[] args) {

        Calculator cal = (a,b) -> {

            return a*b;
        };

        int total = cal.calculate(10,36);
        System.out.println("Multiplication of 10 and 36 :" + total);

    }
}
