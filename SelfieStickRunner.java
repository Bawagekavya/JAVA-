class SelfieStickRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in SelfieStickRunner");
		
		SelfieStick ref = new SelfieStick();
		System.out.println("default value:"+ref.color);
		
		ref.color="green";
		System.out.println("updated value:"+ref.color);
		
		System.out.println("default value:"+ref.cost);
		
		ref.cost=2000;
		System.out.println("updated value:"+ref.cost);
		
		System.out.println("end main in SelfieStickRunner");

	}
	

}