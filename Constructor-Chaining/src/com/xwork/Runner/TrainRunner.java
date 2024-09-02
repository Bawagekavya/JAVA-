package com.xwork.Runner;

import com.xwork.constructor.MetroTrain;
import com.xwork.constructor.SubUrbanTrain;
import com.xwork.constructor.Train;

public class TrainRunner {

    public static void main(String[] args) {

        Train train = new Train("Gulbarga", "Bangalore");
        train.display();

        MetroTrain metroTrain =  new MetroTrain();
        metroTrain.show();

        SubUrbanTrain subUrbanTrain = new SubUrbanTrain();
        subUrbanTrain.details();

    }
}
