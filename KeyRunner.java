class KeyRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in KeyRunner");
		
		Key ref = new Key();
		System.out.println("default value:"+ref.color);
		
		ref.color="silver";
		System.out.println("updated value:"+ref.color);
		
		System.out.println("default value:"+ref.height);
		
		ref.height=3;
		System.out.println("updated value:"+ref.height);
		
		System.out.println("end main in KeyRunner");

	}
	

	
}