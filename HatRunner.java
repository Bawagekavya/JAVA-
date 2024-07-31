class HatRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in HatRunner");
		
		Hat ref = new Hat();
		System.out.println("default value:"+ref.color);
		
		Hat ref1 = new Hat();
		ref1.colors="blue";
		System.out.println("updated value:"+ref1.colors);
		
		Hat ref2 = new Hat();
		System.out.println("default value:"+ref2.cost);
		
		Hat ref3 = new Hat();
		ref3.costs=100;
		System.out.println("updated value:"+ref3.costs);
		
		
		
	    System.out.println("end main in HatRunner");

	}
	

}