class MicroScopeRunner{
	
	public static void main(String [] args)
	
	{
		System.out.println("start main in MicroScoperunner");
		
		MicroScope ref = new MicroScope();
		System.out.println("REF : "+ ref.color);
		
		MicroScope ref1 = new MicroScope();
		System.out.println("REF1 : "+ ref1.cost);
		
		MicroScope ref2 = new MicroScope();
		System.out.println("REF2 : "+ ref2.brand);
		
		MicroScope ref3 = new MicroScope();
		System.out.println("REF3 : "+ ref.type);
		
		
		System.out.println("end main in MicroScoperunner");

	}

}