class HillStationRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in HillStationRunner");
		
		HillStation ref = new HillStation();
		System.out.println("default value:"+ref.height);
		
		HillStation ref1 = new HillStation();
		ref1.heightinmt=804.8;
		System.out.println("updated value:"+ref1.heightinmt);
		
		HillStation ref2 = new HillStation();
		System.out.println("default value:"+ref2.name);
		
		HillStation ref3 = new HillStation();
		ref3.names="Shivagange hills";
		System.out.println("updated value:"+ref3.names);
		
		
		
	    System.out.println("end main in HillStationRunner");

	}
	

}