class SoftwareEngineer{
	
	String name;
	double experience;
	String designation;
	double salary;
	
	SoftwareEngineer(String name , double experience, String designation, double salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
		System.out.println("created SoftwareEngineer");
	}
	
	public void details()
	{
		System.out.println("SoftwareEngineer NAME:" +this.name);
		System.out.println("SoftwareEngineer EXPERIENCE:" +this.experience);
		System.out.println("SoftwareEngineer DESIGNATION:" +this.designation);
		System.out.println("SoftwareEngineer SALARY:" +this.salary);
	}
}