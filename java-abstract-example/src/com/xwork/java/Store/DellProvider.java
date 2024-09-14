package com.xwork.java.Store;

public class DellProvider extends Provider{

    public DellProvider(String name, String ceoName) {
        super(name,ceoName);
        System.out.println("created DellProvider using String ,String constructor");
    }

    @Override
    public void service() {
        System.out.println("created service method in DellProvider");
    }
}
