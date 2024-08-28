package com.xwork.practise.store;

import com.xwork.practise.data.Sandal;

public class SandalRunner {

    public static void main(String[] args) {

        Sandal sandal = new Sandal("Wildcraft",8,1000,"blue");
        sandal.show();

        Sandal sandal1 = new Sandal("medifeet",9,300,"red");
        sandal1.show();

        Sandal sandal2 = new Sandal("crocs",7,9000,"pink");
        sandal2.show();

        Sandal sandal3 = new Sandal("yousta",6,1050,"purple");
        sandal3.show();

        Sandal sandal4 = new Sandal("bata",5,2000,"black");
        sandal4.show();
    }
}
