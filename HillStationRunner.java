class HillStationRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in HillStationRunner");
		
		HillStation ref = new HillStation();
		System.out.println("default value:"+ref.height);
		
		ref.height=804.8;
		System.out.println("updated value:"+ref.height);
		
		System.out.println("default value:"+ref.name);
		
		ref.name="Shivagange hills";
		System.out.println("updated value:"+ref.name);
		
		System.out.println("end main in HillStationRunner");

	}
	

}