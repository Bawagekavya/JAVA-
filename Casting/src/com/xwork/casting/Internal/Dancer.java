package com.xwork.casting.Internal;

public class Dancer {

    public void use(Belt belt)
    {
        System.out.println("created use in dancer");

        belt.tie();

        if(belt instanceof LeatherBelt)
        {
            System.out.println("Belt is instance of leather belt");
            LeatherBelt leatherBelt=(LeatherBelt) belt;
        }
    }
}
