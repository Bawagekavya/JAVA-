class MirrorRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in MirrorRunner");
		
		Mirror ref = new Mirror();
		System.out.println("REF :" + ref.color);
		
		Mirror ref1 = new Mirror();
		System.out.println("REF1 :" + ref1.function);
		
		Mirror ref2 = new Mirror();
		System.out.println("REF2 :" + ref2.cost);
		
		
		System.out.println("end main in MirrorRunner");

	}
}