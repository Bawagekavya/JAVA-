class AeroplaneRunner{
	
		public static void main(String [] args)
	{
		System.out.println("Start main in AeroplaneRunner");
		
		Aeroplane ref=new Aeroplane();
		System.out.println("default value:" + ref.ticketprice);
		
		Aeroplane ref1=new Aeroplane();
		ref1.ticketprices=15000;
		System.out.println("updated value:" + ref1.ticketprices);
		
		Aeroplane ref2=new Aeroplane();
		System.out.println("default value:" +ref2.color);
		
		Aeroplane ref3=new Aeroplane();
		ref3.colors="white";
		System.out.println("updated value:" +ref3.colors);
		
		System.out.println("end main in AeroplaneRunner");

	}
}


