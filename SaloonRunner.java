class SaloonRunner{
	public static void main(String [] args)
	{
		System.out.println("start main in SaloonRunner");
		
		
		
		int out=Saloon.price("feather cut");
		System.out.println("out"+out);  
		
		int out1=Saloon.price1("hairfall");
		System.out.println("out1"+out1); 

		int out2=Saloon.price2("classic facial");
		System.out.println("out2"+out2);
		
		int out3=Saloon.price3("toenails");
		System.out.println("out3"+out3);
		
		int out4=Saloon.price4("bodymassage");
		System.out.println("out4"+out4);
		
		
		int out5=Saloon.price5("grey");
		System.out.println("out5"+out5);
		
		int out6=Saloon.price6("sharp");
		System.out.println("out6"+out6);
		
		System.out.println("end main in SaloonRunner");

	}
	
}