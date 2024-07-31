class MugRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in MugRunner");
		
		Mug mug = new Mug("small",100);
		System.out.println("Mug color :" + mug.color);
		
		System.out.println("Mug Size :" + mug.size);
		System.out.println("Mug cost :" + mug.cost);
		
		mug.type="Ceramic and porcelain";
		System.out.println("Mug type :" + mug.type);
		
		
		System.out.println("end main in MugRunner");

	}
}