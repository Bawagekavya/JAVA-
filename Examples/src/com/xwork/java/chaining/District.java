// this() : calling one constructor from another constructor within same class

package com.xwork.java.chaining;

public class District {

    public String name;
    public String famousFor;

    public District()
    {
        this("null","null");
        System.out.println("created district using no-arg constructor");
    }

    public District(String name, String famousFor) {
        this.name = name;
        this.famousFor=famousFor;

    }

    public District(String taluk)
    {
        this(taluk,taluk);
        System.out.println("Taluk :" + taluk);
    }

    public void display()
    {
        System.out.println("District name :" +name);
        System.out.println("District famousFor :" +famousFor);
    }
}
