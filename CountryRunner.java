class CountryRunner{
	
	public static void main(String [] args)
	{
		System.out.println("Start main in CountryRunner");
		
		Country country = new Country("INDIA", "ASIA");
		country.details();
		
		System.out.println("end main in CountryRunner");
	
	}
}