class ProductRunner{
	public static void main(String [] args)
	{
		System.out.println("start running in main");
		
		String out = Product.shop();
		System.out.println(out);
		
		double out1 =Product.shop1();
		System.out.println(out1);
		
		int out2=Product.shop2();
		System.out.println(out2);
		
		String out3=Product.shop3();
		System.out.println(out3);
		
		String out4=Product.shop4();
		System.out.println(out4);
		
		System.out.println("end running in main");
	}
		
	
	
}