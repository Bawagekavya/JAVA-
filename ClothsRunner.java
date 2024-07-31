class ClothsRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in ClothsRunner");
		
		Cloths ref = new Cloths();
		System.out.println("default value:"+ref.Brand);
		
		ref.Brand="Raymonds";
		System.out.println("updated value:"+ref.Brand);
		
		System.out.println("default value:"+ref.cost);
		
		ref.cost=1200;
		System.out.println("updated value:"+ref.cost);
		
		System.out.println("end main in ClothsRunner");

	}
	

}