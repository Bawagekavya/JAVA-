class Candle{
	
	double length;
	double price;
	String fragrance;
	
	Candle()
	{
		System.out.println("created candle");
	}
	
	Candle(double length)
	{
		this.length=length;
		System.out.println("created candle using double constructor");
	}
	
	Candle(double price,double length)
	{
		this.price=price;
		this.length=length;
		System.out.println("created candle using double constructor");  
	}
	
	Candle(String fragrance)
	{
		this.fragrance=fragrance;
		System.out.println("created candle using String constructor");
	}
	
	Candle(String fragrance,double length)
	{
		this.fragrance=fragrance;
		this.length=length;
        System.out.println("created candle using String and double constructor");
	}
	

	Candle(double price, String fragrance)
	{
		this.fragrance=fragrance;
		this.price=price;
        System.out.println("created candle using String and double constructor");
	}
	
	Candle(String fragrance,double length,double price)
	{
		this.fragrance=fragrance;
		this.length=length;
		this.price=price;
		System.out.println("created candle using String and double constructor");
	}
	
	Candle(double length,String fragrance,double price)
	{
		this.fragrance=fragrance;
		this.length=length;
		this.price=price;
		System.out.println("created candle using String and double constructor");
	}
	
	Candle(double length,double price,String fragrance)
	{
		this.fragrance=fragrance;
		this.length=length;
		this.price=price;
		System.out.println("created candle using String and double constructor");
	}

}
	

