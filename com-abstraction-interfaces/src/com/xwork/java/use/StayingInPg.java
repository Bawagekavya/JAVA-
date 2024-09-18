package com.xwork.java.use;
import com.xwork.java.Rule.PGRule;

public class StayingInPg {

    private PGRule pgRule;

    public void setPgRule(PGRule pgRule)
    {
        this.pgRule = pgRule;
    }

    public void check()
    {
        if(pgRule != null)
        {
            System.out.println("Running check in Staying in Pg");
            double out = pgRule.CostPerMonth();
            boolean out1 = pgRule.Wifi();
            System.out.println("PGCOST :" + out);
            System.out.println("PGWIFI: " + out1);
            System.out.println("PGcost and wifi is not null");
        }
        else
        {
            System.out.println("PGcost and wifi is null");

        }
    }
}
