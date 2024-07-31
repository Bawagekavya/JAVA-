class PostboxRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in PostboxRunner");
		
		Postbox ref = new Postbox();
		System.out.println("default value:"+ref.color);
		
		ref.color="red";
		System.out.println("updated value:"+ref.color);
		
		System.out.println("default value:"+ref.place);
		
		ref.place="Rajajinagar";
		System.out.println("updated value:"+ref.place);
		
	    System.out.println("end main in PostboxRunner");

	}
	

	
}