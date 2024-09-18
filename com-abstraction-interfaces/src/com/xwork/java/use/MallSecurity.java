package com.xwork.java.use;

import com.xwork.java.Rule.MallRule;

public class MallSecurity {

    private MallRule mallRule;

    public void setMallRule(MallRule mallRule)
    {
        this.mallRule = mallRule;
    }

    public void check()
    {
        System.out.println("Running check in MallSecurity");
        if(mallRule != null)
        {
            boolean out = mallRule.validId();
            System.out.println("validId : " +out);
            System.out.println("mallRule is not null");
        }
        else
        {
            System.out.println("mallRule is null");
        }
    }
}
