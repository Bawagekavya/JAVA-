class AnanyaRunner{
	
	public static void main(String [] args)
	{
		System.out.println("Start main in ananyarunner");
		
		Knife knife = new Knife(45.08,29.30);
		
		Ananya ananya = new Ananya(7259958546l, knife);
		ananya.details();
		
		System.out.println("end main in ananyarunner");
		
	}
}