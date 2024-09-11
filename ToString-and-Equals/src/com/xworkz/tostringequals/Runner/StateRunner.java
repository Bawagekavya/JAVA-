package com.xworkz.tostringequals.Runner;

import com.xworkz.tostringequals.Internal.State;


public class StateRunner {

    public static void main(String[] args) {

        State state = new State("Karnataka","Bangalore","job",57748);

        State state1 = new State("Karnataka","Gulbarga","Dal",94847);

        boolean same = state.equals(state1);
        System.out.println("result:" +same);
    }
}
