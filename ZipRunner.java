class ZipRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in ZipRunner");
		
		Zip ref=new Zip();
		System.out.println("default value:"+ref.size);
		
		Zip ref1=new Zip();
		ref1.sizeinmt=50;
		System.out.println("updated value:"+ref1.sizeinmt);
		
		Zip ref2=new Zip();
		System.out.println("default value:"+ref2.cost);
		
		Zip ref3=new Zip();
		ref3.costs=100;
		System.out.println("updated value:"+ref3.costs);

		System.out.println("end main in ZipRunner");
			
	}
}