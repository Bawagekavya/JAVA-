package Runner;

import com.xwork.java.Rule.MallRule;
import com.xwork.java.implement.MallRuleImpl;
import com.xwork.java.use.MallSecurity;

public class MallRuleRunner {

    public static void main(String[] args) {

        MallRule mallRule = new MallRuleImpl();

        MallSecurity mallSecurity = new MallSecurity();
        mallSecurity.setMallRule(mallRule);
        mallSecurity.check();

    }
}
