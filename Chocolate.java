class Chocolate{
	
	String brand="Cadbury";
	double price;
	String flavour;
	String size;
	
	Chocolate(double price)
	{
		System.out.println("created price");
		this.price=price;
		
    }
	
	public void Setflavour(String flavour)
	{
		System.out.println("created setflavour");
		this.flavour=flavour;
	}
	
	
	public static void main(String [] args)
	{
		System.out.println("start running in main");
		
		Chocolate chocolate = new Chocolate(100);
		chocolate.Setflavour("chocolate");
		chocolate.size = "small";
		System.out.println("Brand : " + chocolate.brand);
		System.out.println("Price : " + chocolate.price);
		System.out.println("Flavour :" + chocolate.flavour);
		System.out.println("Size :" + chocolate.size);
		
		Chocolate chocolate1 = new Chocolate(300);
		chocolate1.Setflavour("Ferrero rocher");
		chocolate1.size = "medium";
		System.out.println("Brand : " + chocolate1.brand);
		System.out.println("Price : " + chocolate1.price);
		System.out.println("Flavour :" + chocolate1.flavour);
		System.out.println("Size :" + chocolate1.size);
		
		Chocolate chocolate2 = new Chocolate(599);
		chocolate2.Setflavour("Hersheys");
		chocolate2.size = "small";
		System.out.println("Brand : " + chocolate2.brand);
		System.out.println("Price : " + chocolate2.price);
		System.out.println("Flavour :" + chocolate2.flavour);
		System.out.println("Size :" + chocolate2.size);
	
		System.out.println("end running in main");
	
	}
}