package collection;

import java.time.LocalDate;

public class Cuillere extends Ustensile{
	private double longe;

	public Cuillere(int annee,double longe) {
		super(annee);
		this.longe=longe;
		// TODO Auto-generated constructor stub
	}

	public double getLonge() {
		return longe;
	}

	public void setLonge(double longe) {
		this.longe = longe;
	}
	public double calculvaleur()
	{
		if(LocalDate.now().getYear()-annee>=30)
		{
			return (LocalDate.now().getYear()-annee)*0.5;
		}
		else
		{
			return 0;
		}
	}
	public boolean equals(Object o)
	{
		if(super.equals(o))
		{
			if(((Cuillere)o).longe==this.longe)
			{
				return true;
			}
		}
		return false;
	}

}
