class Rocket{
	
	String country="India";
	double speed;
	double fuelCapacity;
	double noOfThrusters;
	
	Rocket(double speed)
	{
		System.out.println("created speed");
		this.speed=speed;
	}
	
	public void SetfuelCapacity(double fuelCapacity)
	{
		System.out.println("created fuelCapacity");
		this.fuelCapacity=fuelCapacity;
	}
	
	
	
	
	
	public static void main(String [] args)
	{
		System.out.println("start runing in main");
		
		Rocket rocket = new Rocket(3);
		rocket.fuelCapacity=10000;
		rocket.noOfThrusters=3;
		System.out.println("FuelCapacity : " + rocket.fuelCapacity);
		System.out.println("Country :" + rocket.country);
		System.out.println("Speed :" + rocket.speed);
		System.out.println("NoOfThrusters : " + rocket.noOfThrusters);
		
		
		
		Rocket rocket1 = new Rocket(5);
		rocket1.fuelCapacity=2097;
		rocket.noOfThrusters=7;
		System.out.println("FuelCapacity : " + rocket1.fuelCapacity);
		System.out.println("Country :" + rocket1.country);
		System.out.println("Speed :" + rocket1.speed);
		System.out.println("NoOfThrusters : " + rocket.noOfThrusters);
		
		
		Rocket rocket2 = new Rocket(10);
		rocket2.fuelCapacity=4018;
		rocket.noOfThrusters=8;
		System.out.println("FuelCapacity : " + rocket2.fuelCapacity);
		System.out.println("Country :" + rocket2.country);
		System.out.println("Speed :" + rocket2.speed);
		System.out.println("NoOfThrusters : " + rocket.noOfThrusters);

		
		System.out.println("end runing in main");
		
		
	}
}