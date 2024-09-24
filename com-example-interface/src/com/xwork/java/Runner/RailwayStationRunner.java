package com.xwork.java.Runner;

import com.xwork.java.implement.RailwayStationImpl;

public class RailwayStationRunner {

    public static void main(String[] args) {

        RailwayStationImpl railwayStationImpl = new RailwayStationImpl();
        railwayStationImpl.trainNo();
        railwayStationImpl.bookTickets();
    }
}
