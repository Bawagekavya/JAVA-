class IronBoxRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in IronBoxRunner");
		
		IronBox ref = new IronBox();
		System.out.println("REF :" + ref.color);
		
		IronBox ref1 = new IronBox();
		System.out.println("REF1 :" + ref1.brand);
		
		IronBox ref2 = new IronBox();
		System.out.println("REF2 :" + ref2.cost);
		
		IronBox ref3 = new IronBox();
		System.out.println("REF3 :" + ref3.type);
		
		System.out.println("end main in IronBoxRunner");

	}
}