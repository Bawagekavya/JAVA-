public class CricketRuleRunner{
	
	public static void main(String [] args)
	{
		CricketRule cricketRule = new KACricket();
		
		BCCI bcci = new BCCI();
		bcci.SetCricketRule(cricketRule);
		bcci.check();
	}
}