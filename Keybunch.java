class Keybunch{
	
	String material;
	Keys keys; //Association
	
	Keybunch(String material, Keys keys)
	{
		this.material=material;
		this.keys=keys;
		System.out.println("Created keybunch");
	}
	
	public void details()
	{
		System.out.println("KEYBUNCH MATERIAL :" + this.material);
		
		keys.details();
	}
}