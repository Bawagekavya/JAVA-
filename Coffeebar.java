class Coffeebar{
	public static void drinkcoffee(String name,double cost)
	{
		System.out.println("start drinkcoffee in coffeebar");
		
		Shopss.sellcoffee(name,cost);
		
		System.out.println("name"+name);
		System.out.println("COst"+cost);
		
		
		System.out.println("end drinkcoffee in coffeebar");

		
	}
}
