class CCTVRunner{
	
		public static void main(String [] args)
	{
		System.out.println("Start main in CCTGRunner");
		
		CCTV ref=new CCTV();
		System.out.println("default value:" + ref.price);
		
		ref.price=20000;
		System.out.println("updated value:" + ref.price);
		
		System.out.println("default value:" +ref.color);
		
		ref.color="black and white";
		System.out.println("updated value:" +ref.color);
		
		System.out.println("end main in CCTGRunner");

	}
}


