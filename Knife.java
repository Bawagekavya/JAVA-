class Knife{
	
	double weight;
	double height;
	
	Knife(double weight, double height)
	{
		this.weight=weight;
		this.height=height;
		System.out.println("created knife");
	}
	
	public void details()
	{
		System.out.println("KNIFE WEIGHT:" + this.weight);
		System.out.println("KNIFE HEIGHT:" + this.height);
		
	}
}