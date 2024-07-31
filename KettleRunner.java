class KettleRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in Kettlerunner");
		
		Kettle ref = new Kettle();
		System.out.println("REF :"+ ref.color);
		
		Kettle ref1 = new Kettle();
		System.out.println("REF1 :"+ ref1.cost);
		
		Kettle ref2 = new Kettle();
		System.out.println("REF2 :"+ ref2.brand);
		
		System.out.println("end main in Kettlerunner");

	}
}