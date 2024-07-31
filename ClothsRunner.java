class ClothsRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in ClothsRunner");
		
		Cloths ref = new Cloths();
		System.out.println("default value:"+ref.Brand);
		
		Cloths ref1 = new Cloths();
		ref1.Brands="Raymonds";
		System.out.println("updated value:"+ref1.Brands);
		
		Cloths ref2 = new Cloths();
		System.out.println("default value:"+ref2.cost);
		
		Cloths ref3 = new Cloths();
		ref3.costs=1200;
		System.out.println("updated value:"+ref3.costs);
		
		
		
	    System.out.println("end main in ClothsRunner");

	}
	

}