class PosterRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in PosterRunner");
		
		Poster ref = new Poster();
		System.out.println("default value:"+ref.theme);
		
		ref.theme="awareness about education";
		System.out.println("updated value:"+ref.theme);
		
		System.out.println("default value:"+ref.cost);
		
		ref.cost=100;
		System.out.println("updated value:"+ref.cost);
		
		System.out.println("end main in PosterRunner");

	}
	

	
}