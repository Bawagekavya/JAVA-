class PendulumRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in PendulumRunner");
		
		Pendulum pendulum = new Pendulum("Yonata",14500);
		System.out.println("Pendulum color :" + pendulum.color);
		
		System.out.println("Pendulum brand :" + pendulum.brand);
		System.out.println("Pendulum cost :" + pendulum.cost);
		
		pendulum.type="Bifilar pendulum";
		System.out.println("Pendulum type :" + pendulum.type);
		
		
		System.out.println("end main in PendulumRunner");

	}
}