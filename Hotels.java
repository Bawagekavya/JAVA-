class Hotels{
	public static String itemname(double price)
	{
		System.out.println("start itemnname in hotel");
		
		if(price==30)
		{
			return "idli";
		}
		
		if (price==40)
		{
			return "vada";
		}
       System.out.println("end itemname in hotel");
		return "not found";
	}
	
	
	public static String shop(int quantity)
	{
		System.out.println("start shop in hotels");
	
		if(quantity>1 && quantity <10)
		{
			return "yes";
		}
		System.out.println("end itemname in hotel");
		return "no";
	}
	
	
}