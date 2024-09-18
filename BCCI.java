public class BCCI{
	
	private CricketRule cricketRule;
	
	public void SetCricketRule(CricketRule cricketRule)
	{
		this.cricketRule=cricketRule;
	}
	
	public void check()
	{
		System.out.println("running check in BCCI");
		if(cricketRule != null)
		{
			cricketRule.powerPlay();
			System.out.println("cricketrule is not null");
		}
		else
		{
			System.out.println("cricketrule is null");
        }
	}


}