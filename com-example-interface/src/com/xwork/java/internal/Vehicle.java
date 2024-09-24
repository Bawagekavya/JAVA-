// Partial Abstraction

package com.xwork.java.internal;

public  abstract class Vehicle {

    public void startEngine()              // complete method
    {
        System.out.println("Engine Started in vehicle");
    }

    public abstract void accelerate();    // Abstract method
}
