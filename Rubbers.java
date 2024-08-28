class Rubbers{
	
	String color="white";
	double cost;
	double weight;
	String manfDate;
	
	Bookss bookss = new Bookss("Blue",56,200);
	
	
	Rubbers(double cost,double weight,String manfDate)
	{
		this.cost=cost;
		this.weight=weight;
		this.manfDate=manfDate;
		System.out.println("created rubber");
	}
	
	public void details()
	{
		System.out.println("RUBBER COLOR :" +this.color);
		System.out.println("RUBBER COST :" +this.cost);
		System.out.println("RUBBER WEIGHT :" +this.weight);
		System.out.println("RUBBER MANFDATE :" +this.manfDate);
		
		bookss.detail();
		
	}
	
	
}