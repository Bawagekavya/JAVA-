class MessageProvider{
	public static boolean send(String name, String msg)
	{
		System.out.println("start send in messageprovider");
		
		if (name=="Ambani" && msg=="do well")
		{
			
			System.out.println("NAME:"+name);
			System.out.println("Msg:"+msg);
			
			return true;

		}
		
		
		System.out.println("end send in messageprovider");
		return false;

		
	}
}