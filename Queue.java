class Queue{
	public static String accept(String name,String msg,double quantity)
	{
		System.out.println("start accept in queue");
		
		boolean ref=ServiceProvider.send(name,msg);
		System.out.println("Ref:"+ref);
		System.out.println("NAME:"+name);
		System.out.println("MSG:"+msg);
		
		if(quantity==3)
		{
			System.out.println("Quantity:"+quantity);
			return "sent";
		}
		else if (quantity!=3)
		{
			return "NotSent";
		}
		
		System.out.println("end accept in queue");
		
		return "sent";

	}
}