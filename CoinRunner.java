class CoinRunner{
	
	public static void main(String [] args)
	{
		System.out.println("Start main in coinrunner");
		
		Coin ref=new Coin();
		System.out.println("default value:" + ref.shape);
		
		ref.shape="round";
		System.out.println("updated value:" + ref.shape);
		
		System.out.println("default value:" +ref.color);
		
		ref.color="silver";
		System.out.println("updated value:" +ref.color);
		
		System.out.println("end main in coinrunner");

	}

}