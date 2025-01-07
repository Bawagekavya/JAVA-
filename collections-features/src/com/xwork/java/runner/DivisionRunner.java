package com.xwork.java.runner;


import com.xwork.java.interfaces.Division;

public class DivisionRunner {

    public static void main(String[] args) {

        Division division = (a, b) -> {

            return a / b;

        };

        int total = division.div(78, 3);
        System.out.println("Division of 78 by 3 : " + total);
    }
}
