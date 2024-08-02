class WatchRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in watchrunner");
		
		Watch watch = new Watch("Sonata", 700);
		System.out.println("watch color :" + watch.color);
		System.out.println("watch brand :" + watch.brand);
		System.out.println("watch cost :" + watch.cost);
		watch.type="Smart watch";
		System.out.println("watch type :" + watch.type);
		
		Watch watch1 = new Watch("Titan", 700);
		System.out.println("watch color :" + watch1.color);
		System.out.println("watch brand :" + watch1.brand);
		System.out.println("watch cost :" + watch1.cost);
		watch1.type="Smart watch";
		System.out.println("watch type :" + watch1.type);
		
		System.out.println("end main in watchrunner");

	}
}