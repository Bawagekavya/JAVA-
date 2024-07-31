class ZipRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in ZipRunner");
		
		Zip ref=new Zip();
		System.out.println("default value:"+ref.size);
		
		ref.size=50;
		System.out.println("updated value:"+ref.size);
		
		System.out.println("default value:"+ref.cost);
		
		ref.cost=100;
		System.out.println("updated value:"+ref.cost);

		System.out.println("end main in ZipRunner");
			
	}
}