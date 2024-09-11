package com.xwork.java.chaining;

public class State extends Country{

    public State()
    {
        super(); // calls country constructor
        System.out.println("created state using no-arg constructor");
    }

}
