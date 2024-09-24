package com.xwork.java.Runner;

import com.xwork.java.internal.Car;
import com.xwork.java.internal.Vehicle;

public class VehicleRunner {

    public static void main(String[] args) {

        Vehicle  vehicle = new Car();
        vehicle.startEngine();
        vehicle.accelerate();
    }
}
