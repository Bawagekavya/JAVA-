package com.xwork.constructor;

public class SubUrbanTrain extends Train{

    public String source;
    public String destination;

    public SubUrbanTrain()
    {
        System.out.println("created suburban train using no-arg constructor");
    }

    public SubUrbanTrain(String source,String destination)
    {
        System.out.println("Created SubUrbanTrain using string ,string constructor");
        this.source=source;
        this.destination=destination;
    }

    Train train = new Train("kengeri", "Rajajinagar");

    public void details()
    {
        if(train != null)
        {
            train.display();
        }
        else
        {
            System.out.println("suburban train is null");

        }
    }
}
