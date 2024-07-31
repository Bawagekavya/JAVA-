class FurnitureRunner{
	
	public static void main(String [] args)
	{
		System.out.println("Start main in FurnitureRunner");
		
		Furniture ref=new Furniture();
		System.out.println("default value:" + ref.price);
		
		Furniture ref1=new Furniture();
		ref1.prices=15000;
		System.out.println("updated value:" + ref1.prices);
		
		Furniture ref2=new Furniture();
		System.out.println("default value:" +ref2.color);
		
		Furniture ref3=new Furniture();
		ref3.colors="Blue";
		System.out.println("updated value:" +ref3.colors);
		
		System.out.println("end main in FurnitureRunner");

	}

}