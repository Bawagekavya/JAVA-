class RadioRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in RadioRunner");
		
		Radio radio = new Radio("Tune mix radio",11500);
		System.out.println("Radio color :" + radio.color);
		
		System.out.println("Radio brand :" + radio.brand);
		System.out.println("Radio cost :" + radio.cost);
		
		radio.type="FM radio";
		System.out.println("Radio type :" + radio.type);
		
		
		System.out.println("end main in RadioRunner");

	}
}