class Paper{
	
	double thickness=17;
	String size;
	double quality; //out of 5 rating
	String color;
	
	Paper (String size)
	{
		this.size=size;
	}
	
	public void Setquality(double quality)
	{
		this.quality=quality;
	}
	
	public static void main(String [] args)
	{
		System.out.println("start main in paper");
		
		Paper paper = new Paper("small");
		paper.Setquality(5);
		paper.color="blue";
		System.out.println("Thickness : " + paper.thickness);
		System.out.println("Size : " + paper.size);
        System.out.println("Quality : " + paper.quality);
		System.out.println("Color : " + paper.color);
		
		Paper paper1 = new Paper("medium");
		paper1.Setquality(4);
		paper1.color="green";
		System.out.println("Thickness : " + paper1.thickness);
		System.out.println("Size : " + paper1.size);
        System.out.println("Quality : " + paper1.quality);
		System.out.println("Color : " + paper1.color);

		
		Paper paper2 = new Paper("large");
		paper2.Setquality(2);
		paper2.color="yellow";
		System.out.println("Thickness : " + paper2.thickness);
		System.out.println("Size : " + paper2.size);
        System.out.println("Quality : " + paper2.quality);
		System.out.println("Color : " + paper2.color);

      	System.out.println("end main in paper");

	}
}