class KeyRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in KeyRunner");
		
		Key ref = new Key();
		System.out.println("default value:"+ref.color);
		
		Key ref1 = new Key();
		ref1.colors="silver";
		System.out.println("updated value:"+ref1.colors);
		
		Key ref2 = new Key();
		System.out.println("default value:"+ref2.height);
		
		Key ref3 = new Key();
		ref3.heightincm=3;
		System.out.println("updated value:"+ref3.heightincm);
		
		
		
	    System.out.println("end main in KeyRunner");

	}
	

	
}