class CableRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in CableRunner");
		
		Cable cable = new Cable("Finolex",1500);
		System.out.println("Cable color :" + cable.color);
		
		System.out.println("Cable brand :" + cable.brand);
		System.out.println("Cable cost :" + cable.cost);
		
		cable.type="Ribbon electric cable";
		System.out.println("Cable type :" + cable.type);
		
		
		System.out.println("end main in CableRunner");

	}
}