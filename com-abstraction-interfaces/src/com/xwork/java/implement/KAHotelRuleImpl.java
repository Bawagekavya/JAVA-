package com.xwork.java.implement;

import com.xwork.java.Rule.HotelRule;

public class KAHotelRuleImpl implements HotelRule {

    @Override
    public boolean cleanPremises() {
        System.out.println("running cleanPremises in KAHotelRuleImpl");
        return true;
    }
}
