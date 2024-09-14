package com.xwork.java.Store;

public class BookMyShowMovieBookingProvider extends MovieBookingProvider{

    public double totalHalls;

    public BookMyShowMovieBookingProvider(double totalHalls,String name, String ceoName)
    {
        super(name,ceoName);
        this.totalHalls = totalHalls;
        System.out.println("created BookMyShowMovieBookingProvider using  double ,String , String constructor");
        System.out.println("Profit:" + this.totalHalls);
    }

    @Override
    public void book() {
        System.out.println("implemented book method in BookMyShowMovieBookingProvider ");
    }

    @Override
    public void cancel() {
        System.out.println("implemented cancel method in BookMyShowMovieBookingProvider ");

    }

    @Override
    public void service() {
        System.out.println("created service method in BookMyShowMovieBookingProvider");
    }
}
