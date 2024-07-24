class SongsName{
	public static void main(String [] args)
	{
		System.out.println("start main in songsname");
		
		String s1="Rekkeyya kudure yeri";
		String s2="Amma Amma I love u";
		String s3="yenagali munde saagu nii";
		String s4="Nannusire Nannusire";
		String s5="meri behna";
		String s6="Dhaagon se baandhaa";
		String s7="Balapa hidida bhagavanta";
		String s8="Meri maa ke bababar koi nahi";
		String s9="Luka chuppi";
		String s10="Parapancha Neene";
		
		String[] totalsongsnames={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
		
		for(int begin=0;begin<totalsongsnames.length;begin++)
		{
			System.out.println("Begin:"+totalsongsnames[begin]);
		}
		
		System.out.println("TOTALSONGSNAMES:"+totalsongsnames.length);
		System.out.println("end main in songsname");

		
	}
}