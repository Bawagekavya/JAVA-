package com.xwork.java.runner;

import com.xwork.java.interfaces.RedBus;

public class RedBusRunner {

    public static void main(String[] args) {

        RedBus redBus = (a) -> {

            return a;
        };

        int booking = redBus.minBooking(15);
        System.out.println("MinBooking :" + booking);
    }


}
