package com.xwork.java.Store;

public class JioInternetProvider extends InternetProvider{

    public JioInternetProvider(String name, String ceoName) {
        super(name,ceoName);
        System.out.println("created JioInternetProvider using String ,String constructor");
    }

    @Override
    public void service() {
        System.out.println("created service method in JioInternetProvider");
    }

}
