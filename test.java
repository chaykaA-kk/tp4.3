package collection;

public class test {
		public static void main(String[] args) {
			Ustensile[] us = new Ustensile[5];
			us[0] = new AssietteRond(1926, 8.4);
			us[1] = new Cuillere(1881, 7.3);
			us[2] = new AssietteCarre(1935, 5.6);
			us[3] = new Cuillere(1917, 8.8);
			us[4] = new AssietteRond(1837, 5.4);
			
			
			
			
			affichecollection(us);
			calculcuillere(us);
			for(int i=0;i<5;i++) {
				if(us[i] instanceof AssietteCarre ) {
					 System.out.println(((AssietteCarre) us[i]).calculesurface()) ;
				}
				else if(us[i] instanceof AssietteRond ) {
					 System.out.println(((AssietteRond) us[i]).calculesurface()) ;
				}
			}
			affichesurfacetotale(us);
			//afficherValeurTotale(us);
			Cuillere c=new Cuillere (1988,9.7);
			AssietteRond A3=new AssietteRond(1837, 5.4);
			equal(us,c);
			equal(us,A3);
			

	}
	static void affichecollection(Ustensile us[]) {
		for(int i=0;i<us.length;i++) {
			System.out.println(us[i]);
		}
	}
	public static void calculcuillere(Ustensile us[]) {
		int nb=0;
		for(int i=0;i<5;i++) {
			if(us[i] instanceof Cuillere ) {
				nb++;
			}
			}
		System.out.println("il ya "+nb+" cuillers");

	}
	public static void affichesurfacetotale(Ustensile us[]) {
		double nbt=0;
		for(int i=0;i<5;i++) {
			if(us[i] instanceof AssietteRond) {
				nbt+=((AssietteRond) us[i]).calculesurface();
			}
			else if(us[i] instanceof AssietteCarre) {
				nbt+=((AssietteCarre) us[i]).calculesurface();
			}
			System.out.println(nbt);
		}
	}
	static void equal(Ustensile us[], Object u)
	{
		int i=0;
		boolean test=false;
		while(i<us.length && test==false)
		{
			if(us[i].equals(u))
			{
				System.out.println("existe");
				test=true;
			}
			else
			{
				i++;
			}
		}
		if(test==false)
		{
			System.out.println("n'existe pas");
		}
	}
	}











