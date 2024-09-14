package com.xwork.java.Store;

import java.util.Objects;

public abstract class Provider {

    public String Name;
    public String ceoName;

    public Provider()
    {
        System.out.println("created provider using no-arg constructor");
    }

    public Provider(String name, String ceoName) {
        Name = name;
        this.ceoName = ceoName;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "Name='" + Name + '\'' +
                ", ceoName='" + ceoName + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object obj){
        if(obj != null) {
            if(obj instanceof Provider) {

                Provider provider = (Provider)obj;
                System.out.println("use instanceof to convert subclass type to parent type");

                if(this.Name.equals(provider.Name) && this.ceoName.equals(provider.ceoName))
                {
                    System.out.println("The given ref are equal");
                    return true;
                }
                else {
                    System.out.println("both are not equal");
                }
            }
            else {
                System.out.println("obj is null");
            }
        }
        return super.equals(obj);
    }

    public abstract void service();

}
