package com.xwork.java.implement;

import com.xwork.java.Rule.PGRule;

public class PGRuleImpl implements PGRule {

    @Override
    public double CostPerMonth() {
        return 5500;
    }

    @Override
    public boolean Wifi() {
        return true;
    }
}
