class WalletRunner{
	
	public static void main(String [] args)
	{
		System.out.println("start main in WalletRunner");
		
		Wallet ref = new Wallet();
		System.out.println("REF :" + ref.color);
		
		Wallet ref1 = new Wallet();
		System.out.println("REF1 :" + ref1.cost);
		
		Wallet ref2 = new Wallet();
		System.out.println("REF2 :" + ref2.size);
		
		Wallet ref3 = new Wallet();
		System.out.println("REF3 :" + ref3.type);
		
		
		System.out.println("end main in WalletRunner");

	}
}