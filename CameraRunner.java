class CameraRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in Camera");
		
		Camera ref = new Camera();
		System.out.println("default value:"+ref.name);
		
		ref.name="Action cameras";
		System.out.println("updated value:"+ref.name);
		
		System.out.println("default value:"+ref.cost);
		
		ref.cost=20000;
		System.out.println("updated value:"+ref.cost);
		
		
		
	    System.out.println("end main in Camera");

	}
	

}