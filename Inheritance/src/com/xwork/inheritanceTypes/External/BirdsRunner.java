package com.xwork.inheritanceTypes.External;

import com.xwork.inheritanceTypes.Internal.Aves;
import com.xwork.inheritanceTypes.Internal.Birds;

public class BirdsRunner {

    public static void main(String[] args) {

        Aves aves = new Aves();
        aves.show();
        aves.name="Peacock";
        aves.color="Green";
        aves.feather();

    }
}
