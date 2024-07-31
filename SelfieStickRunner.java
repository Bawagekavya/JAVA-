class SelfieStickRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in SelfieStickRunner");
		
		SelfieStick ref = new SelfieStick();
		System.out.println("default value:"+ref.color);
		
		SelfieStick ref1 = new SelfieStick();
		ref1.colors="green";
		System.out.println("updated value:"+ref1.colors);
		
		SelfieStick ref2 = new SelfieStick();
		System.out.println("default value:"+ref2.cost);
		
		SelfieStick ref3 = new SelfieStick();
		ref3.costs=2000;
		System.out.println("updated value:"+ref3.costs);
		
		
		
	    System.out.println("end main in SelfieStickRunner");

	}
	

}