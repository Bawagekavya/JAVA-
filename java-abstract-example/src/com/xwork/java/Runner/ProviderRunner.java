package com.xwork.java.Runner;

import com.xwork.java.Store.DellProvider;
import com.xwork.java.Store.InternetProvider;
import com.xwork.java.Store.Provider;
import com.xwork.java.Store.BookingProvider;
import com.xwork.java.Store.LenovoProvider;
import com.xwork.java.Store.MovieBookingProvider;
import com.xwork.java.Store.BookMyShowMovieBookingProvider;
import com.xwork.java.Store.AirtelInternetProvider;
import com.xwork.java.Store.ExtremeAirtelInternetProvider;
import com.xwork.java.Store.JioInternetProvider;
import com.xwork.java.Store.SatjioInternetProvider;
import com.xwork.java.Store.Fast5gExtreme;

public  class ProviderRunner {

    public static void main(String[] args) {

        System.out.println("Running main method");

        Provider provider = new BookingProvider("Sukanya","Soumya");
        System.out.println(provider);
        boolean same = provider.equals(provider);
        System.out.println(same);
        provider.service();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Provider provider1 = new MovieBookingProvider("Rakshita","Shweta");
        System.out.println(provider1);
        boolean same1 = provider1.equals(provider1);
        System.out.println(same1);
        provider1.service();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        Provider provider2 = new BookMyShowMovieBookingProvider(987,"Geeta","PadmaPriya");
        System.out.println(provider2);
        boolean same2 = provider2.equals(provider2);
        System.out.println(same2);
        provider2.service();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");



        Provider provider3 = new DellProvider("Rashmi","Sindhu");
        System.out.println(provider3);
        boolean same3 = provider3.equals(provider3);
        System.out.println(same3);
        provider3.service();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");



        Provider provider4 = new LenovoProvider(987.98,"Divya","Laxmi");
        System.out.println(provider4);
        boolean same4 = provider4.equals(provider4);
        System.out.println(same4);
        provider4.service();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");




        Provider provider5 = new InternetProvider("Someshwari","smita");
        System.out.println(provider5);
        boolean same5 = provider5.equals(provider5);
        System.out.println(same5);
        provider5.service();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        Provider provider6 = new AirtelInternetProvider("Bhagya","Rani");
        System.out.println(provider6);
        boolean same6 = provider6.equals(provider6);
        System.out.println(same6);
        provider6.service();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        Provider provider7 = new ExtremeAirtelInternetProvider("Sangamesh","Bhavana");
        System.out.println(provider7);
        boolean same7 = provider7.equals(provider7);
        System.out.println(same7);
        provider7.service();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Provider provider10 = new Fast5gExtreme("Shourya","Rudresh");
        System.out.println(provider10);
        boolean same10 = provider10.equals(provider10);
        System.out.println(same10);
        provider10.service();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Provider provider8 = new JioInternetProvider("Sanjana","Bhuvana");
        System.out.println(provider8);
        boolean same8 = provider8.equals(provider8);
        System.out.println(same8);
        provider8.service();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Provider provider9 = new SatjioInternetProvider("January 23","Sanjana","Bhuvana");
        System.out.println(provider9);
        boolean same9 = provider9.equals(provider9);
        System.out.println(same9);
        provider9.service();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
