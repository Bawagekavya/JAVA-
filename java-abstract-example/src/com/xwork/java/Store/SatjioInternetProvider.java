package com.xwork.java.Store;

public class SatjioInternetProvider extends JioInternetProvider{

    public String LaunchDate;

    public SatjioInternetProvider(String LaunchDate,String name, String ceoName) {
        super(name,ceoName);
        this.LaunchDate = LaunchDate;
        System.out.println("created SatjioInternetProvider using String ,String ,String constructor");
    }

    @Override
    public void service() {
        System.out.println("created service method in SatjioInternetProvider");
    }
}

