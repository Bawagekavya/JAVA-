class HarmonicaRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in HarmonicaRunner");
		
		Harmonica harmonica = new Harmonica("Seydel skydiver steel tremolo ",14500);
		System.out.println("Harmonica color :" + harmonica.color);
		
		System.out.println("Harmonica brand :" + harmonica.brand);
		System.out.println("Harmonica cost :" + harmonica.cost);
		
		harmonica.type="Octave";
		System.out.println("Harmonica type :" + harmonica.type);
		
		
		System.out.println("end main in HarmonicaRunner");

	}
}