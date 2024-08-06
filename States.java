class States{
	
	String name;
	String language;
	CapitalCity capitalCity = new CapitalCity("Benguluru",203846);
	
	States(String name, String language)
	{
		this.name=name;
		this.language=language;
		System.out.println("created states");
	}
	
	public void details()
	{
		System.out.println("States NAME : " + this.name);
		System.out.println("States LANGUAGE : " + this.language);
        this.capitalCity.details();
		}
	
}