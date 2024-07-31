class TreeRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in TreeRunner");
		
		Tree ref = new Tree();
		System.out.println("default value:"+ref.color);
		
		Tree ref1 = new Tree();
		ref1.colors="green";
		System.out.println("updated value:"+ref1.colors);
		
		Tree ref2 = new Tree();
		System.out.println("default value:"+ref2.name);
		
		Tree ref3 = new Tree();
		ref3.names="papaya";
		System.out.println("updated value:"+ref3.names);
		
		
		
	    System.out.println("end main in TreeRunner");

	}
	

	
}