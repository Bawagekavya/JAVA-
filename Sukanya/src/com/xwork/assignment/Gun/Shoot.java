package com.xwork.assignment.Gun;

public class Shoot {

    public String name="Rifle";
    public String CountryMade="India";
    public String type="Handgun";

    public Shoot()
    {
        System.out.println("created shoot using no-arg constructor...");
    }

    public void fire()
    {
        System.out.println("created fire");
    }

    public void display()
    {
        System.out.println("Gun Name :"+ name);
        System.out.println("Gun CountryMade :"+ CountryMade);
        System.out.println("Gun Type :"+ type);

    }

}
