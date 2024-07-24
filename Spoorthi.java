class Spoorthi{
	public static String sendmsg(String name, String msg, double quantity)
	{
		System.out.println("start sendmsg in spoorthi");
		
		String ref=Queue.accept(name,msg,quantity);
		System.out.println("Ref:"+ref);
		System.out.println("NAME:"+name);
		System.out.println("MSG:"+msg);
		System.out.println("QUANTITY:"+quantity);

		
	    System.out.println("end sendmsg in spoorthi");
		
		return "sent";

		
	}
}