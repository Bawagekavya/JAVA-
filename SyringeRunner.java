class SyringeRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in SyringeRunner");
		
		Syringe syringe = new Syringe("BD",100);
		System.out.println("Syringe color :" + syringe.color);
		
		System.out.println("Syringe brand :" + syringe.brand);
		System.out.println("Syringe cost :" + syringe.cost);
		
		syringe.type="Insulin syringe";
		System.out.println("Syringe type :" + syringe.type);
		
		
		System.out.println("end main in SyringeRunner");

	}
}