class Place{
	public static void assign(String name, double price, String date, boolean urgent)
	{
		System.out.println("start assign in place");
		
		Order.deliver(name,date,urgent);
		System.out.println("Name:"+name);
		System.out.println("Price:"+price);
		System.out.println("Date:"+date);
		System.out.println("Urgent:"+urgent);
		
		
		
		
		System.out.println("end assign in place");

	}
}