class HelmetRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in helmetrunner");
		
		Helmet ref = new Helmet();
		System.out.println("default value:"+ ref.cost);
		
		ref.cost=100;
		System.out.println("updated value:"+ ref.cost);
		
        System.out.println("default value:"+ ref.color);
		
		ref.color="blue";
		System.out.println("updated value:"+ ref.color);
		
		
		System.out.println("end main in helmetrunner");

	}
}