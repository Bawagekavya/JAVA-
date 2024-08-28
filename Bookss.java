class Bookss{
	
	String name ="claasmate";
	String color;
	double cost;
    double pages;
	
	Trees trees = new Trees("papaya", 4570,25.04);
	
	Bookss(String color,double cost,double pages)
	{
		this.color=color;
		this.cost=cost;
		this.pages=pages;
		System.out.println("created bookss");
	}
	
	public void detail()
	{
		System.out.println("Book name :" + this.name);
		System.out.println("Book color :" + this.color);
		System.out.println("Book cost :" + this.cost);
		System.out.println("Book pages :" + this.pages);
		
		trees.details();
		
	}

}