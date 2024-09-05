package com.xwork.casting.External;

import com.xwork.casting.Internal.Belt;
import com.xwork.casting.Internal.Dancer;
import com.xwork.casting.Internal.LeatherBelt;

public class BeltRunner {

    public static void main(String[] args) {

        Belt belt = new Belt();

        LeatherBelt leatherBelt = new LeatherBelt();

        Dancer dancer = new Dancer();
        dancer.use(belt);
        dancer.use(leatherBelt);
    }
}
