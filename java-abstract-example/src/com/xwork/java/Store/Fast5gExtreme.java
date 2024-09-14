package com.xwork.java.Store;

public class Fast5gExtreme extends ExtremeAirtelInternetProvider{

    public Fast5gExtreme(String name, String ceoName) {
        super(name,ceoName);
        System.out.println("created Fast5gExtreme using String ,String constructor");
    }

    @Override
    public void service() {
        System.out.println("created service method in Fast5gExtreme");
    }
}
