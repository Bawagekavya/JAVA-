class StraightenerRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in StraightenerRunner");
		
		Straightener straightener = new Straightener("Philips",3100);
		System.out.println("Straightener color :" + straightener.color);
		
		System.out.println("Straightener brand :" + straightener.brand);
		System.out.println("Straightener cost :" + straightener.cost);
		
		straightener.type="curly";
		System.out.println("Straightener type :" + straightener.type);
		
		
		System.out.println("end main in StraightenerRunner");

	}
}