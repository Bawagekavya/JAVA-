class GanaviRunner{
	
	public static void main(String [] args)
	{
		System.out.println("Start main in ganavirunner");
		
		Clip clip = new Clip("Blue", "Fibre");
		
		Ganavi ganavi = new Ganavi("Ganavi123@gmail.com", clip);
		ganavi.details();
		
		System.out.println("end main in ganavirunner");
		
	}
}