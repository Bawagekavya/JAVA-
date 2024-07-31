class CameraRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in Camera");
		
		Camera ref = new Camera();
		System.out.println("default value:"+ref.name);
		
		Camera ref1 = new Camera();
		ref1.names="Action cameras";
		System.out.println("updated value:"+ref1.names);
		
		Camera ref2 = new Camera();
		System.out.println("default value:"+ref2.cost);
		
		Camera ref3 = new Camera();
		ref3.costs=20000;
		System.out.println("updated value:"+ref3.costs);
		
		
		
	    System.out.println("end main in Camera");

	}
	

}