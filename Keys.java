class Keys{
	
	double weight;
	String brand;
	
	Keys(Double weight, String brand)
	{
		this.weight=weight;
		this.brand=brand;
		System.out.println("created key");
	}
	
	public void details()
	{
		System.out.println("KEY WEIGHT :" + this.weight);
		System.out.println("KEY BRAND :" + this.brand);
	}
}