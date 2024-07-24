class Sukanya{
	public static void sendGift(String name, double price, String date, boolean urgent)
	{
		System.out.println("start sendGift in Sukanya");
		
		Place.assign(name,price,date,urgent);
		System.out.println("Name:"+name);
		System.out.println("Price:"+price);
		System.out.println("Date:"+date);
		System.out.println("Urgent:"+urgent);
		
		
		
		System.out.println("end sendGift in Sukanya");


	
	
	
	}
}