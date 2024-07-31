class AnkletsRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in AnkletsRunner");
		
		Anklets anklets = new Anklets("medium",57);
		System.out.println("Syringe color :" + anklets.color);
		
		System.out.println("Anklets brand :" + anklets.size);
		System.out.println("Anklets cost :" + anklets.cost);
		
		anklets.type="Beaded anklets";
		System.out.println("Anklets type :" + anklets.type);
		
		
		System.out.println("end main in AnkletsRunner");

	}
}