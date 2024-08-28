class Trees{
	
	String color="Green";
	String name;
	double cost;
	double weight;
	
	Trees(String name, double cost,double weight)
	{
		this.name=name;
		this.cost=cost;
		this.weight=weight;
		System.out.println("created trees");
		
	}
	
	public void details()
	{
		System.out.println("TREE color:" + this.color);
		System.out.println("TREE name:" + this.name);
		System.out.println("TREE cost:" + this.cost);
		System.out.println("TREE weight:" + this.weight);
		
	}
	
	
	
}