package com.xwork.java.internal;

public class SubUrbanTrain {

    public void SeatNO(Train train)
    {
        System.out.println("created seat no in subUrbanTrain ");
        train.bookTicket();

        if(train instanceof MetroTrain)
        {
            System.out.println("train is instance of metroTrain");
            MetroTrain metroTrain = (MetroTrain)train;
            metroTrain.Station();
        }
    }
}
