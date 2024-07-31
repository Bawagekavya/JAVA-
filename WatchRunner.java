class WatchRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in watchrunner");
		
		Watch watch = new Watch("Sonato", 700);
		System.out.println("watch color :" + watch.color);
		
		System.out.println("watch brand :" + watch.brand);
		System.out.println("watch cost :" + watch.cost);
		
		watch.type="Smart watch";
		System.out.println("watch type :" + watch.type);
		
		
		System.out.println("end main in watchrunner");

	}
}