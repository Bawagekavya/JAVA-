package Runner;

import com.xwork.java.Rule.HotelRule;
import com.xwork.java.implement.KAHotelRuleImpl;
import com.xwork.java.use.FoodSafetyDepartment;


public class HotelRuleRunner {

    public static void main(String[] args) {

        HotelRule hotelRule = new KAHotelRuleImpl();

        FoodSafetyDepartment foodSafetyDepartment = new FoodSafetyDepartment();
        foodSafetyDepartment.SetCricketRule(hotelRule);
        foodSafetyDepartment.check();
    }
}
