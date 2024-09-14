package com.xwork.java.Store;

public class InternetProvider extends Provider{

    public InternetProvider(String name, String ceoName) {
        super(name,ceoName);
        System.out.println("created InternetProvider using String ,String constructor");
    }

    @Override
    public void service() {
        System.out.println("created service method in InternetProvider");
    }
}
