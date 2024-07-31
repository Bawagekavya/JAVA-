class TripodRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in Tripod");
		
		Tripod ref=new Tripod();
		System.out.println("default value:"+ref.name);
		
		ref.name="Syvo WT-3131";
		System.out.println("updated value:"+ref.name);
		
		System.out.println("default value:"+ref.cost);
		
		ref.cost=10000;
		System.out.println("updated value:"+ref.cost);

		System.out.println("end main in TripodRunner");
		
	}
}