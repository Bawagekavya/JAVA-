class ShoeFactory{
	public static int order(String brand)
	{
		System.out.println("Start order in ShoeFactory");
		
		if(brand=="puma")
		{
			System.out.println("Brand:"+brand);
			return 1500;

		}

		if(brand=="Nike")
		{
			System.out.println("Brand:"+brand);
			return 2000;

		}
		
		
		System.out.println("end order in ShoeFactory");
		
		return 0;

	}
}