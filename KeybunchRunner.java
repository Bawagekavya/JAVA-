class KeybunchRunner{
	
	public static void main(String [] args)
	{
		System.out.println("Start main in KeybunchRunner");
		
	    Keys keys = new Keys (80.50, "Adornkeys");
		
		Keybunch keybunch = new Keybunch("Steel", keys);
		keybunch.details();
		
		
		System.out.println("end main in KeybunchRunner");
		
	}
}