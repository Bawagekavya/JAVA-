class ATMRunner{
	
	public static void main(String [] args)
	{
		System.out.println("Start main in atmrunner");
		
		ATM atm=new ATM();
		System.out.println("default value:" +atm.color);
		
		atm.color="blue";
		System.out.println("updated value:" + atm.color);
		
		System.out.println("default value:" +atm.validity);
		
		atm.validity="5 years";
		System.out.println("default value:" +atm.validity);
		
		System.out.println("end main in atmrunner");

	}

}