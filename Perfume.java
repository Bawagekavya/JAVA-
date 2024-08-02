class Perfume{
	
	String brand;
	double cost;
	double price;
	String quantity;
	
	Perfume()
	{
		System.out.println("Created perfume");
	}
	
	
	Perfume(String brand, double price)
	{
		this.brand=brand;
		this.price=price;
		System.out.println("Created perfume using string and price constructor");
	}
	
	Perfume(String brand, double price,String quantity)
	{
		this.brand=brand;
		this.price=price;
		this.quantity=quantity;
		System.out.println("created perfume using string, price and string constructor");
	}
	
	Perfume(String brand, double price,String quantity,double cost)
	{
		this.brand=brand;
		this.price=price;
		this.quantity=quantity;
		this.cost=cost;
		System.out.println("created perfume using string,price,quantity and cost constructor");
	}
	
	
	public static void main(String [] args)
	{
		System.out.println("start main in perfume");
		
		Perfume perfume = new Perfume();
		System.out.println("Perfume default value :" + perfume);
		
		Perfume perfume1 = new Perfume("Burberry",5000);
		System.out.println("Perfume1 brand :" + perfume1.brand);
		System.out.println("Perfume1 price :" + perfume1.price);
		
		Perfume perfume2 = new Perfume("Azzaro",1000,"medium");
		System.out.println("Perfume2 brand :" + perfume2.brand);
		System.out.println("Perfume2 price :" + perfume2.price);
		System.out.println("Perfume2 quantity :" + perfume2.quantity);
		
		Perfume perfume3 = new Perfume("Armani",500,"small", 600);
		System.out.println("Perfume3 brand :" + perfume3.brand);
		System.out.println("Perfume3 price :" + perfume3.price);
		System.out.println("Perfume3 quantity :" + perfume3.quantity);
		System.out.println("Perfume3 cost :" + perfume3.cost);

		System.out.println("end main in perfume");

	}
	
}
