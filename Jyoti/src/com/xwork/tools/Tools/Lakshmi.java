// Parameter

package com.xwork.tools.Tools;

public class Lakshmi {

    public void content(WashingMachine washingMachine)
    {
        if(washingMachine != null)
        {
            System.out.println("WashingMachine Brand :" + washingMachine.brand);
            System.out.println("WashingMachine Type :" +washingMachine.type);
            System.out.println("WashingMachine Capacity :" + washingMachine.capacity);
            washingMachine.rinse();
            washingMachine.show();
        }else
        {
            System.out.println("washing machine is null");
        }
    }
}
