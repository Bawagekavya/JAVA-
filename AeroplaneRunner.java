class AeroplaneRunner{
	
		public static void main(String [] args)
	{
		System.out.println("Start main in AeroplaneRunner");
		
		Aeroplane ref=new Aeroplane();
		System.out.println("default value:" + ref.ticketprice);
		
		ref.ticketprice=15000;
		System.out.println("updated value:" + ref.ticketprice);
		
		System.out.println("default value:" +ref.color);
		
     	ref.color="white";
		System.out.println("updated value:" +ref.color);
		
		System.out.println("end main in AeroplaneRunner");

	}
}


