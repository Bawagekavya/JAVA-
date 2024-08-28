class MainRunner
{
	public static void main(String [] args)
	{
		
		Trees trees = new Trees("Papaya");
		trees.cost = 9685;
		trees.weight=98.98;
		
		Bookss bookss = new Bookss("blue", trees);
		bookss.cost=28;
		bookss.pages=120;
		
		Rubbers rubbers = new Rubbers(39, bookss);
		rubbers.weight=29.9;
		rubbers.manfDate="31st aug";
		
		Pens pens = new Pens(76);
		//pens.weight=29.03;
		//pens.color="Red";
		pens.detailed();
		
	}
}