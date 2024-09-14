package com.xwork.java.Store;

public class ExtremeAirtelInternetProvider extends AirtelInternetProvider{

    public ExtremeAirtelInternetProvider(String name, String ceoName) {
        super(name,ceoName);
        System.out.println("created ExtremeAirtelInternetProvider using String ,String constructor");
    }

    @Override
    public void service() {
        System.out.println("created service method in ExtremeAirtelInternetProvider");
    }

}
