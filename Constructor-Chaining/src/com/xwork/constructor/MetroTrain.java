package com.xwork.constructor;

public class MetroTrain extends Train{

    public String source;
    public String destination;

    public MetroTrain()
    {
        System.out.println("created MetroTrain train using no-arg constructor");
    }

    public MetroTrain(String source, String destination)
    {
        super(source, destination);
        System.out.println("created MetroTrain using string ,string constructor");
        this.source = source;
        this.destination = destination;
    }

    Train train = new Train("Vijaynagar","Yashwantpur");

    public void show()
    {
        if (train != null)
       {
           train.display();
       }
       else
       {
           System.out.println("metro train is null");

       }
    }
}
