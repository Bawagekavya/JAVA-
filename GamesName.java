class GamesName{
	public static void main(String [] args)
	{
		System.out.println("start main in gamesname");
		
		String g1="Hockey";
		String g2="Badminton";
		String g3="Cricket";
		String g4="Tennis";
		String g5="Basketball";
		String g6="Handball";
		String g7="Throwball";
		String g8="Karate";
		String g9="Boxing";
		String g10="Hide and seek";
		
		String[] Totalgamesname={g1,g2,g3,g4,g5,g6,g7,g8,g9,g10};
		
		for(int begin=0;begin<Totalgamesname.length;begin++)
		{
			System.out.println("TOTALGAMESNAME:"+Totalgamesname[begin]);
		}
		
		
		System.out.println("TOTALGAMESNAME:"+Totalgamesname.length);
		System.out.println("end main in gamesname");

	}
}