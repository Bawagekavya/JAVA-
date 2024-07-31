class NirakshaRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in NirakshaRunner");
		
		Niraksha ref=new Niraksha();
		System.out.println("default value : " +ref.USN);
		
		ref.USN="3PD20EC030";
		System.out.println("updated value : " +ref.USN);
		
		System.out.println("default value : " +ref.homeTown);
		
		ref.homeTown="Rajajinagar";
		System.out.println("updated value : " +ref.homeTown);
		
		System.out.println("end main in NirakshaRunner");

	}

}