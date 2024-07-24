class ServiceProvider{
	public static boolean send(String name, String msg)
	{
		System.out.println("start send in serviceprovider");
		
		boolean ref=MessageProvider.send(name,msg);
		System.out.println("REF:"+ref);
		
		System.out.println("NAME:"+name);
		System.out.println("MSG:"+msg);
		
		System.out.println("end send in serviceprovider");

		return true;
	}
}