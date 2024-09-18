package Runner;

import com.xwork.java.Rule.PGRule;
import com.xwork.java.implement.PGRuleImpl;
import com.xwork.java.use.StayingInPg;

public class PGRuleRunner {

    public static void main(String[] args) {

        PGRule pgRule= new PGRuleImpl();

        StayingInPg stayingInPg = new StayingInPg();
        stayingInPg.setPgRule(pgRule);
        stayingInPg.check();
    }
}
