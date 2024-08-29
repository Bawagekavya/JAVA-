package com.xwork.tools.Runner;

import com.xwork.tools.Tools.*;
import sun.nio.fs.BasicFileAttributesHolder;

public class WashingMachineRunner {

    public static void main(String[] args) {

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.rinse();
        washingMachine.show();
        System.out.println("=========");

        System.out.println("Local Variable");
        Megha megha = new Megha();
        megha.Machine();

        System.out.println("Parameter");
        Lakshmi lakshmi = new Lakshmi();
        lakshmi.content(washingMachine);

        System.out.println("Instance variable");
        Abhishek abhishek = new Abhishek();
        abhishek.details();

        System.out.println("Return - Type");
        Bhumika bhumika = new Bhumika();
        if(bhumika != null)
        {
            System.out.println("WashingMachine Brand :" + washingMachine.brand);
            System.out.println("WashingMachine Type :" + washingMachine.type);
            System.out.println("WashingMachine Capacity :" + washingMachine.capacity);
            washingMachine.rinse();
            washingMachine.show();
        }else
        {
            System.out.println("washing machine is null");
        }

        System.out.println("Local variable");
        Nayana nayana = new Nayana();
        nayana.display();
    }
}
