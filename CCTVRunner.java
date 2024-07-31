class CCTVRunner{
	
		public static void main(String [] args)
	{
		System.out.println("Start main in CCTGRunner");
		
		CCTV ref=new CCTV();
		System.out.println("default value:" + ref.price);
		
		CCTV ref1=new CCTV();
		ref1.prices=20000;
		System.out.println("updated value:" + ref1.prices);
		
		CCTV ref2=new CCTV();
		System.out.println("default value:" +ref2.color);
		
		CCTV ref3=new CCTV();
		ref3.colors="black and white";
		System.out.println("updated value:" +ref3.colors);
		
		System.out.println("end main in CCTGRunner");

	}
}


