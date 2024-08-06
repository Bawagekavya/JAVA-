class Hotelssss{
	
	String name = "Shantisagar";
    Owner owner = new Owner("Sukanya",22,"Female");

	
	public void details()
	{
		System.out.println("Hotelssss NAME :" +name);
		System.out.println("Hotelssss owner:" +owner);
		this.owner.details();

	}
	
	
}