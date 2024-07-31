class HelmetRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in helmetrunner");
		
		Helmet ref = new Helmet();
		System.out.println("default value:"+ ref.cost);
		
		Helmet ref1 = new Helmet();
		ref1.costs=100;
		System.out.println("updated value:"+ ref1.costs);
		
		Helmet ref2 = new Helmet();
		System.out.println("default value:"+ ref.color);
		
		Helmet ref3 = new Helmet();
		ref3.colors="blue";
		System.out.println("updated value:"+ ref.colors);
		
		
		System.out.println("end main in helmetrunner");

	}
}