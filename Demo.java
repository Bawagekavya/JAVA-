class Demo{
	public static void voting()
	{
		System.out.println("START voting in demo");
		int age=10;
		if (age>=18)
		{
			System.out.println("Right age to take for voting");
			
		}	
		else
		{
			System.out.println("Not the right age to take for voting");
		}
		
		System.out.println("END voting in demo");
		
	}
	
	public static void marriage()
	{
		System.out.println("START marriage in demo");
		int age=10;
		String name="kanya";
		if (age>=21 && name=="kanya")
		{
			System.out.println("kanya is applicable for marriage");
			
		}	
		else
		{
			System.out.println("kanya is not applicable for marriage");
		}
		
		System.out.println("END marriage in demo");
		
	}
	
	public static void PoliceService()
	{
		System.out.println("START PoliceService in demo");
		double weightinkgforfemale=40;
		int ageforfemale=24;
		if (weightinkgforfemale>=45 && ageforfemale>=19  && ageforfemale<+45)
		{
			System.out.println("eligible for policeservice");
			
		}	
		else
		{
			System.out.println("not eligible for policeservice");
		}
		
		System.out.println("END PoliceService in demo");
		
	}
	
	public static void product()
	{
		System.out.println("START product in demo");
		double price=14400;
		double quantityinkg=1;
		long pincode=585411;
		int mobile=1;
		if(price==150000 && quantityinkg==2 && pincode==123456 && mobile==3)
		{
			System.out.println("product is valid");
			
		}
		else{
			System.out.println("product is not valid");
		}
		
		System.out.println("END product in demo");

		
		
	}
	
	public static void verification()
	{
		System.out.println("START verification in demo");
		long verification = 232196380317L;
		//System.out.println(verification);
		
		if(verification == 232196380317L)
		{
			System.out.println("aadhar number is verified");
		}
		
		else
		{
			System.out.println("aadhar number is not verified");
		}
		
		System.out.println("END verification in demo");

		
	}
	
	
	
	
	
}