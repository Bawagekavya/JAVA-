class Projector{
	
	String company="Video projector";
	String type;
	String color;
	double weight;
	
	Projector(String color)
	{
		System.out.println("created color");
		this.color=color;
		
    }
	
	public void Settype(String type)
	{
		System.out.println("created type");
		this.type=type;
	}
	
	
	public static void main(String [] args)
	{
		System.out.println("start running in main");
		
		Projector projector = new Projector("Blue");
		projector.Settype("LCD");
		projector.weight = 45;
		System.out.println("Company : " + projector.company);
		System.out.println("Type : " + projector.type);
		System.out.println("Color :" + projector.color);
		System.out.println("Weight :" + projector.weight);
		
		Projector projector1 = new Projector("green");
		projector1.Settype("DLP");
		projector1.weight = 67;
		System.out.println("Company : " + projector1.company);
		System.out.println("Type : " + projector1.type);
		System.out.println("Color :" + projector1.color);
		System.out.println("Weight :" + projector1.weight);
		
		Projector projector2 = new Projector("black");
		projector2.Settype("chocolate");
		projector2.weight = 98;
		System.out.println("Company : " + projector2.company);
		System.out.println("Type : " + projector2.type);
		System.out.println("Color :" + projector2.color);
		System.out.println("Weight :" + projector2.weight);
		
		System.out.println("end running in main");
	
	}
}