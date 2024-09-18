package com.xwork.java.use;

import com.xwork.java.Rule.HotelRule;

public class FoodSafetyDepartment {

    private HotelRule hotelRule;

    public void SetCricketRule(HotelRule hotelRule)
    {
        this.hotelRule=hotelRule;
    }

    public void check()
    {
        System.out.println("running check in FoodSafetyDepartment");
        if(hotelRule != null)
        {
            hotelRule.cleanPremises();
            System.out.println("Hotelrule is not null");
        }
        else
        {
            System.out.println("Hotelrule is null");
        }
    }
}
