class PosterRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in PosterRunner");
		
		Poster ref = new Poster();
		System.out.println("default value:"+ref.theme);
		
		Poster ref1 = new Poster();
		ref1.themes="awareness about education";
		System.out.println("updated value:"+ref1.themes);
		
		Poster ref2 = new Poster();
		System.out.println("default value:"+ref2.cost);
		
		Poster ref3 = new Poster();
		ref3.costs=100;
		System.out.println("updated value:"+ref3.costs);
		
		
		
	    System.out.println("end main in PosterRunner");

	}
	

	
}