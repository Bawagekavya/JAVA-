class Fort{
	public static String name(String location)
	{
		System.out.println("start name in fort");
		if(location=="mysore")
		{
			return "mysorefort";
		}
		
		if(location=="delhi")
		{
			return "delhifort";
		}
		
		if(location=="bidar")
		{
			return "bidarfort";
		}
		
		
		System.out.println("end name in fort");
		return "not found";

		
		
		
	}
}	