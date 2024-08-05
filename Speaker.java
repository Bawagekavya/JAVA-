class Speaker
{
	String brand="JBL Flip 6";   // literal
	String size;
    double cost;
	String output;
	
	Speaker(String size)       //constructor
	{
		System.out.println("Speaker created");
		this.size=size;
	}
	
	public void SetCost(double cost)  //setter method
	{
		System.out.println("created setcost");
		this.cost=cost;
	}
	
	
	
	
    public static void main(String [] args)
	{
		System.out.println("Start running in main");
		
		Speaker speaker = new Speaker("Small");      //reference
		speaker.SetCost(12333);        
		speaker.output = "song playing";         //reference
		System.out.println("SPEAKER BRAND :" + speaker.brand);
		System.out.println("SPEAKER SIZE :" + speaker.size);
        System.out.println("SPEAKER COST :" + speaker.cost);
		System.out.println("SPEAKER OUTPUT :" + speaker.output);
		
		Speaker speaker1 = new Speaker("medium");      //reference
		speaker1.SetCost(2746);        
		speaker1.output = "song not audiable";         //reference
		System.out.println("SPEAKER1 BRAND :" + speaker1.brand);
		System.out.println("SPEAKER1 SIZE :" + speaker1.size);
        System.out.println("SPEAKER1 COST :" + speaker1.cost);
		System.out.println("SPEAKER1 OUTPUT :" + speaker1.output);
		
		Speaker speaker2 = new Speaker("large");      //reference
		speaker2.SetCost(9473);        
		speaker2.output = "song not playing";         //reference
		System.out.println("SPEAKER2 BRAND :" + speaker2.brand);
		System.out.println("SPEAKER2 SIZE :" + speaker2.size);
        System.out.println("SPEAKER2 COST :" + speaker2.cost);
		System.out.println("SPEAKER2 OUTPUT :" + speaker2.output);
		
		System.out.println("end running in main");
		
		
	}
}