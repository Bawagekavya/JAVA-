class MaskRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in MaskRunner");
		
		Mask mask = new Mask("AsGARD ",200);
		System.out.println("Mask color :" + mask.color);
		
		System.out.println("Mask brand :" + mask.brand);
		System.out.println("Mask cost :" + mask.cost);
		
		mask.type="N95 mask";
		System.out.println("Mask type :" + mask.type);
		
		
		System.out.println("end main in MaskRunner");

	}
}