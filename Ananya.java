class Ananya{
	
	long mobile;
	Knife knife;
	
	Ananya(long mobile, Knife knife)
	{
		this.mobile=mobile;
		this.knife=knife;
		System.out.println("created ananya");
	}
	
	public void details()
	{
		System.out.println("ANANYA MOBILE :" + this.mobile);
		knife.details();
	}
}