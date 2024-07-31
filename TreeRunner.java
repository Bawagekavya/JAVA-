class TreeRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in TreeRunner");
		
		Tree ref = new Tree();
		System.out.println("default value:"+ref.color);
		
		ref.color="green";
		System.out.println("updated value:"+ref.color);
		
		System.out.println("default value:"+ref.name);
		
		ref.name="papaya";
		System.out.println("updated value:"+ref.name);
		
		
		
	    System.out.println("end main in TreeRunner");

	}
	

	
}