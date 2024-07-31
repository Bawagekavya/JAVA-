class InjectionRunner{
	
	public static void main(String [] args)
	{
		System.out.println("Start main in InjectionRunner");
		
		Injection ref = new Injection();
		System.out.println("REF : "+ref.type);
		
		Injection ref1 = new Injection();
		System.out.println("REF1 : "+ref1.cost);
		
		Injection ref2 = new Injection();
		System.out.println("REF2 : "+ref2.color);
		
		System.out.println("end main in InjectionRunner");

	}
}