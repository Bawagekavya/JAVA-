package com.xwork.java.Store;

public class MovieBookingProvider extends BookingProvider{

    public MovieBookingProvider(String name, String ceoName)
    {
        super(name,ceoName);
        System.out.println("created MovieBookingProvider using String , String constructor ");
    }

   @Override
    public void service() {
        System.out.println("created service method in MovieBookingProvider");
    }

    public void book()
    {
        System.out.println("created book method MovieBookingProvider");

    }

    public void cancel()
    {
            System.out.println("created book method MovieBookingProvider");

    }


}
