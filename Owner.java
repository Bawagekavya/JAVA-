class Owner{
	
	String name;
	double age;
	String gender;
	
	Owner(String name, double age, String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("created owner");
	}
	
	public void details()
	{
		System.out.println("Owner NAME :" + this.name);
		System.out.println("Owner AGE :" + this.age);
		System.out.println("Owner GENDER :" + this.gender);
		
	}
}