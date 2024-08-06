class CapitalCity{
	
	String name;
	double population;
	
	CapitalCity(String name, double population)
	{
		this.name=name;
		this.population=population;
		System.out.println("created CapitalCity");
	}
	
	public void details()
	{
		System.out.println("CapitalCity NAME : " + this.name);
		System.out.println("CapitalCity POPULATION : " + this.population);
	}
}