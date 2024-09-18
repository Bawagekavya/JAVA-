package com.xwork.java.use;

import com.xwork.java.Rule.TrafficRule;

public class ReduceAsscidents {

    private TrafficRule trafficRule;

    public void SetReduceAsscidents(TrafficRule trafficRule)
    {
        this.trafficRule=trafficRule;
    }

    public void check()
    {
        System.out.println("Running check in ReduceAccidents");
        if(trafficRule != null)
        {
           String out = trafficRule.licenceNo();
            System.out.println("licenceNo : " +out);
            System.out.println("TrafficRule is not null");
        }
        else
        {
            System.out.println("TrafficRule is null");
        }
    }
}
