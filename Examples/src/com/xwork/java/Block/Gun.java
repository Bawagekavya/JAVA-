package com.xwork.java.Block;

public class Gun {

    static {
        System.out.println("static block executed");
    }

    {
        System.out.println("instance block executed");
    }

    public Gun()
    {
        System.out.println("created no-arg constructor");
    }

}
