package com.xwork.java.Store;

public class LenovoProvider extends Provider{

    public double Profit;

    public LenovoProvider(double Profit,String name, String ceoName)
    {
        super(name,ceoName);
        System.out.println("created LenovoProvider uisng double, String , String constructor");
        this.Profit=Profit;
        System.out.println("Profit:" + this.Profit);
    }


    @Override
    public void service() {
        System.out.println("created service method in LenovoProvider");
    }
}
