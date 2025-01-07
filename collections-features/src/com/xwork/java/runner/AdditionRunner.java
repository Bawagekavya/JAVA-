package com.xwork.java.runner;

import com.xwork.java.interfaces.Addition;

public class AdditionRunner {

    public static void main(String[] args) {

        Addition addition = (a,b) -> {

            return a+b;

        };

        int total = addition.add(10,20);
        System.out.println("Addition of 10 and 20 : " + total );
    }
}
