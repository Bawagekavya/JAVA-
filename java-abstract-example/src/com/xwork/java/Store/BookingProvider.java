package com.xwork.java.Store;

public class BookingProvider extends Provider{

    public BookingProvider(String name, String ceoName) {
        super(name,ceoName);
        System.out.println("created BookingProvider using String , String constructor ");
    }

    @Override
    public void service() {
        System.out.println("created service method in BookingProvider");
    }


}
