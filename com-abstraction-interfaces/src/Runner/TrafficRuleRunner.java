package Runner;

import com.xwork.java.implement.TrafficRuleImpl;
import com.xwork.java.Rule.TrafficRule;
import com.xwork.java.use.ReduceAsscidents;

public class TrafficRuleRunner {

    public static void main(String[] args) {

        TrafficRule trafficRule = new TrafficRuleImpl();

        ReduceAsscidents reduceAsscidents = new ReduceAsscidents();
        reduceAsscidents.SetReduceAsscidents(trafficRule);
        reduceAsscidents.check();
    }
}
