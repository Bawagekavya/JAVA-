class HotelsRunner{
	public static void main(String [] args)
	{
		System.out.println("start main in hotelsrunner");
		
		String out=Hotels.itemname(25);
		System.out.println("out"+out);
		
		String out1=Hotels.itemname(40);
		System.out.println("out1"+out1);
		
		String out2=Hotels.shop(1);
		System.out.println("out2"+out2);
		
		System.out.println("end main in hotelsrunner");
	}
	
}