class Restorant{
    double southindianMelasPrice=110;
	double northMelasPrice=110;
	double iceCreamPrice=60;
	double pineapplejuicePrice=90;
	double TeaPrice=15;
	
	
	public double order(String foodName,String addItems){
		double totalfoodprice = 0;
	
	if(foodName.equals("rice"))
	{
		
	    totalfoodprice=southindianMelasPrice;
		return totalfoodprice;
	}
	
	else
	
	if(foodName.equals("maggi"))
	{
		
	    totalfoodprice=northMelasPrice;
		return totalfoodprice;
	}
	
	else
	
	if(foodName.equals(iceCreamPrice))
	{
		totalfoodprice=iceCreamPrice;
		return totalfoodprice;
	}
	
	else
	if(foodName.equals(pineapplejuicePrice))
	{
		totalfoodprice=pineapplejuicePrice;
		return totalfoodprice;
	}
	else
	if(foodName.equals(TeaPrice))
	{
		totalfoodprice=TeaPrice;
		return totalfoodprice;
	}
	else
	if((foodName.equals(southindianMelasPrice)) && (foodName.equals(northMelasPrice)))
	{
		totalfoodprice=southindianMelasPrice+northMelasPrice;
		return totalfoodprice;
	}
	else
	if((addItems.equals(iceCreamPrice)))
	{
	    totalfoodprice=iceCreamPrice;
		return totalfoodprice;
	}
	else
	if((foodName.equals(northMelasPrice)) && (foodName.equals(iceCreamPrice)))
	{
	    totalfoodprice=northMelasPrice+iceCreamPrice;
		return totalfoodprice;
	}
	else
	if((foodName.equals(southindianMelasPrice)) && (foodName.equals(iceCreamPrice)))
	{
	    totalfoodprice=southindianMelasPrice+iceCreamPrice;
		return totalfoodprice;
	}
	
	
	return totalfoodprice;
	}
		
}
	
