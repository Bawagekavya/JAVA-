class InjectionRunner{
	
	public static void main(String [] args)
	{
		System.out.println("Start main in InjectionRunner");
		
		Injection ref = new Injection();
		System.out.println("REF : "+ref.type);
		
		System.out.println("REF : "+ref.cost);
		
		System.out.println("REF : "+ref.color);
		
		System.out.println("end main in InjectionRunner");

	}
}