package Runner;

import com.xwork.java.implement.KACricketImpl;
import com.xwork.java.Rule.CricketRule;
import com.xwork.java.use.BCCI;

public class CricketRuleRunner {

    public static void main(String[] args) {

        CricketRule cricketRule = new KACricketImpl();

        BCCI bcci = new BCCI();
        bcci.SetCricketRule(cricketRule);
        bcci.check();
    }

}
