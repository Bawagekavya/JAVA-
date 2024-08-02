class Metal{
	
	String name;
	double cost;
	
	Metal()
	{
		System.out.println("created metal");
	}
	
	Metal(String name)
	{
		this.name=name;
		System.out.println("created metal using string constructor");
	}
	
	Metal(double cost)
	{
		this.cost=cost;
		System.out.println("created metal using double constructor");
	}
	
	Metal(String name, double cost)
	{
		this.name=name;
		this.cost=cost;
		System.out.println("created metal using string and double constructor");
	}
	
	
	public static void main(String [] values)
	
	{
		System.out.println("start main in metal");
		
		Metal metal = new Metal();
		System.out.println("Metal default value : "+ metal);
		
		Metal metal1 = new Metal("Platinum");
        System.out.println("Metal1 name :" + metal1.name);
		
		Metal metal2 = new Metal(2000);
        System.out.println("Metal2 cost :" + metal2.cost);
		
		Metal metal3 = new Metal("Gold", 65000);
		System.out.println("Metal3 name :" + metal3.name);
		System.out.println("Metal3 cost :" + metal3.cost);
		
		System.out.println("end main in metal");

	}
	
}