// Instance variable

package com.xwork.tools.Tools;

public class Abhishek {

    WashingMachine washingMachine = new WashingMachine();

    public void details(){

        if (washingMachine != null)
        {
            washingMachine.rinse();
            washingMachine.show();
        }else
        {
            System.out.println("washing machine is null");
        }

    }
}
