class Clip{
	
	String color;
	String type;
	
	Clip(String color, String type)
	{
		this.color=color;
		this.type=type;
		System.out.println("created clip");
	}
	
	public void details()
	{
		System.out.println("CLIP COLOR :" + this.color);
		System.out.println("CLIP TYPE :" + this.type);
	}
}