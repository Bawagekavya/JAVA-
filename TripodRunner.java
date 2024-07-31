class TripodRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in Tripod");
		
		Tripod ref=new Tripod();
		System.out.println("default value:"+ref.name);
		
		Tripod ref1=new Tripod();
		ref1.names="Syvo WT-3131";
		System.out.println("updated value:"+ref1.names);
		
		Tripod ref2=new Tripod();
		System.out.println("default value:"+ref2.cost);
		
		Tripod ref3=new Tripod();
		ref3.costs=10000;
		System.out.println("updated value:"+ref3.costs);

		System.out.println("end main in TripodRunner");
		
	}
}