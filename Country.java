class Country{
	
	String name;
	String continent;
	States states = new States("Karnataka", "Kannada");
	
	Country(String name, String continent)
	{
		this.name=name;
		this.continent=continent;
		System.out.println("created country");
	}
	
	public void details()
	{
		System.out.println("Country NAME : " + this.name);
		System.out.println("Country CONTINENT : " + this.continent);
        this.states.details();
		}
}