class CoinRunner{
	
	public static void main(String [] args)
	{
		System.out.println("Start main in coinrunner");
		
		Coin ref=new Coin();
		System.out.println("default value:" + ref.shape);
		
		Coin ref1=new Coin();
		ref1.shapes="round";
		System.out.println("updated value:" + ref1.shapes);
		
		Coin ref2=new Coin();
		System.out.println("default value:" +ref2.color);
		
		Coin ref3=new Coin();
		ref3.colors="silver";
		System.out.println("updated value:" +ref3.colors);
		
		System.out.println("end main in coinrunner");

	}

}