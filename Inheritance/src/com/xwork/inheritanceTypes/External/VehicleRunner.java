package com.xwork.inheritanceTypes.External;

import com.xwork.inheritanceTypes.Internal.Car;
import com.xwork.inheritanceTypes.Internal.MotorCycle;

public class VehicleRunner {

    public static void main(String[] args) {

        Car car = new Car();
        car.display();
        car.brand="Toyota";
        car.color="Blue";
        car.details();

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.show();
        motorCycle.brand="Honda";
        motorCycle.color="Purple";
        motorCycle.details();
    }
}
