class PillowRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in PillowRunner");
		
		Pillow ref = new Pillow();
		System.out.println("REF :" + ref.color);
		
		Pillow ref1 = new Pillow();
		System.out.println("REF1 :" + ref1.cost);
		
		Pillow ref2 = new Pillow();
		System.out.println("REF2 :" + ref2.size);
		
		
		System.out.println("end main in PillowRunner");

	}
}