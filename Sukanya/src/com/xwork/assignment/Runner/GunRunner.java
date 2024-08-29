package com.xwork.assignment.Runner;

import com.xwork.assignment.Gun.*;


public class GunRunner {

    public static void main(String[] args) {

        Shoot shoot = new Shoot();
        shoot.fire();
        shoot.display();
        System.out.println("==========");

        System.out.println("Local Variable");
        Soldier soldier = new Soldier();
        soldier.save();

        System.out.println("Parameter");
        Police police = new Police();
        police.encounter(shoot);

        System.out.println("Instance");
        Dboss dboss =new Dboss();
        dboss.actor();

        System.out.println("RETURN TYPE");
        Godse godse = new Godse();
        if(godse != null)
        {
            System.out.println(shoot.name);
            System.out.println(shoot.CountryMade);
            System.out.println(shoot.type);        }
        else {
            System.out.println("shoot is null");
        }

    }
}
