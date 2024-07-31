class MusicalInstrumentRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in MusicalInstrumentrunner");
		
		MusicalInstrument ref = new MusicalInstrument();
		System.out.println("REF : " + ref.type);
		
		MusicalInstrument ref1 = new MusicalInstrument();
		System.out.println("REF1 : " + ref1.color);
		
		MusicalInstrument ref2 = new MusicalInstrument();
		System.out.println("REF2 : " + ref2.cost);
		
		MusicalInstrument ref3 = new MusicalInstrument();
		System.out.println("REF3 : " + ref3.CreateMusic);
		
		System.out.println("end main in MusicalInstrumentrunner");

	}
}