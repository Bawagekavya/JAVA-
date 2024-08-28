class Pens{
	
	String name="Dax";
	double cost;
	double weight;
	String color;
	
	Rubbers rubbers = new Rubbers(29.9,"31st aug");
	
	Pens(double cost, Rubbers rubbers)
	{
		this.cost=cost;
		this.rubbers=rubbers;
		System.out.println("created pens");
	}
	
	public void detailed()
	{
		System.out.println("Pens name :" + this.name);
		System.out.println("Pens Cost :" + this.cost);
		System.out.println("Pens Weight :" + this.weight);
		System.out.println("Pens Color :" + this.color);
		
		rubbers.details();
	}
	
	
}