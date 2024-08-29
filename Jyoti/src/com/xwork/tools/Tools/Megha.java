// Local Variable

package com.xwork.tools.Tools;

public class Megha {

    public void Machine()
    {
        WashingMachine washingMachine = new WashingMachine();
        System.out.println("WashingMachine Brand :" + washingMachine.brand);
        System.out.println("WashingMachine Type :" + washingMachine.type);
        System.out.println("WashingMachine Capacity :" + washingMachine.capacity);
        washingMachine.rinse();
        washingMachine.show();
    }
}
