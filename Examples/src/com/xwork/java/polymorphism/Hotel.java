// Compile-time

package com.xwork.java.polymorphism;

public class Hotel {

    private String hotelName;
    private String order;
    private int noOfWorkers;
    private String ownerName;

    public Hotel(String hotelName, String order) {
        this.hotelName = hotelName;
        this.order = order;
        System.out.println("HotelName:" + hotelName);
        System.out.println("Order:" + order);
    }

    public Hotel(String ownerName, int noOfWorkers) {
        this.ownerName = ownerName;
        this.noOfWorkers = noOfWorkers;
        System.out.println("NoOfWorkers:" +noOfWorkers);
        System.out.println("ownerName:" +ownerName);

    }

    public void display(String hotelName, String order)
    {
        System.out.println("HotelName:" + hotelName);
        System.out.println("Order:" + order);
    }

    public void display(int noOfWorkers,String ownerName)
    {
        System.out.println("NoOfWorkers:" +noOfWorkers);
        System.out.println("ownerName:" +ownerName);
    }

}
