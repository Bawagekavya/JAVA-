class CoffeePowder{
	
	double cost;
	String company;
	double weight;
	String manfDate;
	
	CoffeePowder()
	{
		System.out.println("created coffeepowder ");
	}
	
	CoffeePowder(String company)
	{
		this.company=company;
		System.out.println("created coffeepowder using string constructor");
	}
	
	CoffeePowder(String company,double cost, double weight, String manfDate)
	{
		this.company=company;
		this.cost=cost;
		this.weight=weight;
		this.manfDate=manfDate;
		System.out.println("created coffeepowder using string ,double,double and string constructor");
	}
	
	CoffeePowder(String company,String manfDate)
	{
		this.company=company;
		this.manfDate=manfDate;
		System.out.println("created coffeepowder using string constructor");
	}
	
	CoffeePowder(double weight)
	{
		this.weight=weight;
		System.out.println("created coffeepowder using double constructor");
	}
	
	public static void main(String [] args)
	{
		System.out.println("start main in coffeepowder");
		
		CoffeePowder coffeepowder = new CoffeePowder();
		System.out.println("Coffeepowder default value :" + coffeepowder);
		
		CoffeePowder coffeepowder1 = new CoffeePowder("Bru");
		System.out.println("Coffeepowder1 company :" + coffeepowder1.company);
		
		CoffeePowder coffeepowder2 = new CoffeePowder("Nescafe",29,3,"2 august");
		System.out.println("Coffeepowder2 company :" + coffeepowder2.company);
		System.out.println("Coffeepowder2 cost :" + coffeepowder2.cost);
        System.out.println("Coffeepowder2 weight :" + coffeepowder2.weight);
        System.out.println("Coffeepowder2 manfDate :" + coffeepowder2.manfDate);
		
		CoffeePowder coffeepowder3 = new CoffeePowder("Bayars","28 feb");
        System.out.println("Coffeepowder3 company :" + coffeepowder3.company);
        System.out.println("Coffeepowder3 manfDate :" + coffeepowder3.manfDate);
		
		CoffeePowder coffeepowder4 = new CoffeePowder(30);
		System.out.println("Coffeepowder4 weight :" + coffeepowder4.weight);

        System.out.println("end main in coffeepowder");

	}
	
	
	
}