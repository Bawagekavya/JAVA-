class PostboxRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in PostboxRunner");
		
		Postbox ref = new Postbox();
		System.out.println("default value:"+ref.color);
		
		Postbox ref1 = new Postbox();
		ref1.colors="red";
		System.out.println("updated value:"+ref1.colors);
		
		Postbox ref2 = new Postbox();
		System.out.println("default value:"+ref2.place);
		
		Postbox ref3 = new Postbox();
		ref3.places="Rajajinagar";
		System.out.println("updated value:"+ref3.places);
		
		
		
	    System.out.println("end main in PostboxRunner");

	}
	

	
}