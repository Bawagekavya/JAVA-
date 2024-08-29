// local variable

package com.xwork.tools.Tools;

public class Nayana {

    public void display()
    {
        WashingMachine washingMachine = new WashingMachine();
        System.out.println("WashingMachine Brand :" + washingMachine.brand);
        System.out.println("WashingMachine Type :" + washingMachine.type);
        System.out.println("WashingMachine Capacity :" + washingMachine.capacity);
        washingMachine.rinse();
        washingMachine.show();
    }
}
