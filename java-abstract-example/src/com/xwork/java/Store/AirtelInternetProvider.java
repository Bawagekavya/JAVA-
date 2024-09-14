package com.xwork.java.Store;

public class AirtelInternetProvider extends InternetProvider{

    public AirtelInternetProvider(String name, String ceoName) {
        super(name,ceoName);
        System.out.println("created AirtelInternetProvider using String ,String constructor");
    }

    @Override
    public void service() {
        System.out.println("created service method in AirtelInternetProvider");
    }
}
