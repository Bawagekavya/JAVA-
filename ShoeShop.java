class ShoeShop{
	
	public static int purchase(String brand)
	{
		System.out.println("Start purchase in shoeshop");
		
		int ref=ShoeFactory.order(brand);
		System.out.println("Ref:"+ref);
		
		System.out.println("end purchase in shoeshop");
		
		return ref;

	}
	
}