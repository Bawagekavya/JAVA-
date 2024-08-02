class Restorant{
    double southindianMelasPrice=110;
	double northMelasPrice=110;
	double iceCreamPrice=60;
	double pineapplejuicePrice=90;
	double TeaPrice=15;
	
	
	public double order(String foodName,String addItems){
		double totalfoodprice = 0;
	
	if(foodName.equals(southindianMelasPrice))
	{
		
	    totalfoodprice=southindianMelasPrice;
		return totalfoodprice;
	}
	
	
	
	if(foodName.equals(northMelasPrice))
	{
		
	    totalfoodprice=northMelasPrice;
		return totalfoodprice;
	}
	
	
	
	if(foodName.equals(iceCreamPrice))
	{
		totalfoodprice=iceCreamPrice;
		return totalfoodprice;
	}
	
	
	if(foodName.equals(pineapplejuicePrice))
	{
		totalfoodprice=pineapplejuicePrice;
		return totalfoodprice;
	}
	
	if(foodName.equals(TeaPrice))
	{
		totalfoodprice=TeaPrice;
		return totalfoodprice;
	}
	
	if((foodName.equals(southindianMelasPrice)) && (foodName.equals(northMelasPrice)))
	{
		totalfoodprice=southindianMelasPrice+northMelasPrice;
		return totalfoodprice;
	}
	
	if((addItems.equals(iceCreamPrice)))
	{
	    totalfoodprice=iceCreamPrice;
		return totalfoodprice;
	}
	
	if((foodName.equals(northMelasPrice)) && (foodName.equals(iceCreamPrice)))
	{
	    totalfoodprice=northMelasPrice+iceCreamPrice;
		return totalfoodprice;
	}
	
	if((foodName.equals(southindianMelasPrice)) && (foodName.equals(iceCreamPrice)))
	{
	    totalfoodprice=southindianMelasPrice+iceCreamPrice;
		return totalfoodprice;
	}
	
	
	return totalfoodprice;
	}
		
}
	
