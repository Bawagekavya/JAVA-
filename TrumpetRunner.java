class TrumpetRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in TrumpetRunner");
		
		Trumpet trumpet = new Trumpet("Bach",1500);
		System.out.println("Trumpet color :" + trumpet.color);
		
		System.out.println("Trumpet brand :" + trumpet.brand);
		System.out.println("Trumpet cost :" + trumpet.cost);
		
		trumpet.type="Bb trumpet";
		System.out.println("Trumpet type :" + trumpet.type);
		
		
		System.out.println("end main in TrumpetRunner");

	}
}