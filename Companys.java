class Companys{
	
	String id;
	String name;
	String location;
	SoftwareEngineer softwareEngineer = new SoftwareEngineer("Omkar",3,"Testing", 500000);
	
	Companys(String id, String name, String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
		System.out.println("created company");
	}
	
	public void details()
	{
		System.out.println("Companys ID:" +this.id);
		System.out.println("Companys NAME:" +this.name);
		System.out.println("Companys LOCATION:" +this.location);
		System.out.println("Companys SOFTWAREENGINEER:" +softwareEngineer);
		this.softwareEngineer.details();
	}
		
	
}