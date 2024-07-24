class Shopss{
	public static void sellcoffee(String name, double cost)
	
	{
		System.out.println("start sellcoffee in shop");
		
		Staff.makecoffee(name,cost);
		
		System.out.println("name"+name);
		System.out.println("COst"+cost);
		
		System.out.println("end sellcoffee in shop");

	}
}