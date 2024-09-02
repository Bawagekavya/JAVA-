package com.xwork.constructor;

public class Train {

   public double no;
    public String source;
    public String destination;

    public Train()
    {
        System.out.println("created train using no arg constructor");
    }

    public Train(String source, String destination)
    {
        System.out.println("created train using string , string constructor");
        this.no=no;
        this.source = source;
        this.destination = destination;
    }

    public void display()
    {
        System.out.println("Train No:" + this.no);
        System.out.println("Train Source:" + this.source);
        System.out.println("Train Destination:" + this.destination);
    }
}
