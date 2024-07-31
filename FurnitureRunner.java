class FurnitureRunner{
	
	public static void main(String [] args)
	{
		System.out.println("Start main in FurnitureRunner");
		
		Furniture ref=new Furniture();
		System.out.println("default value:" + ref.price);
		
		ref.price=15000;
		System.out.println("updated value:" + ref.price);
		
		System.out.println("default value:" +ref.color);
		
     	ref.color="Blue";
		System.out.println("updated value:" +ref.color);
		
		System.out.println("end main in FurnitureRunner");

	}

}