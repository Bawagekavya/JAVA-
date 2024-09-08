package com.xwork.java.external;


import com.xwork.java.internal.MetroTrain;
import com.xwork.java.internal.SubUrbanTrain;
import com.xwork.java.internal.Train;

public class Runner {

    public static void main(String[] args) {

        Train train = new MetroTrain();

        SubUrbanTrain subUrbanTrain1 = new SubUrbanTrain();
        subUrbanTrain1.SeatNO(train);
    }
}
