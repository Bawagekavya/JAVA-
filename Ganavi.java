class Ganavi{
	
	String email;
	Clip clip;
	
	Ganavi(String email, Clip clip)
	{
		this.email=email;
		this.clip=clip;
		System.out.println("Created ganavi");
	}
	
	public void details()
	{
		System.out.println("GANAVI EMAIL :" + this.email);
		clip.details();
	}
}