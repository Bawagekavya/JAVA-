class WardrobeRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in Wardrobe");
		
		Wardrobe ref=new Wardrobe();
	    System.out.println("default value : " +ref.size);
		
		ref.size=5.5;
	    System.out.println("updated value : " +ref.size);
		
        System.out.println("default value : " +ref.color);

		ref.color="blue";
		System.out.println("updated value : " +ref.color);
		
		System.out.println("end main in Wardrobe");

	}
}