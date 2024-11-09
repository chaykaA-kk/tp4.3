package collection;

public class AssietteCarre extends assiette {
	private double cote;

	public AssietteCarre(int annee,double cote) {
		super(annee);
		this.cote=cote;
		// TODO Auto-generated constructor stub
	}

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}

	@Override
	public String toString() {
		return "AssietteCarre [cote=" + cote + "]";
	}
	public double calculesurface() {
		return cote * cote;
	}
		 
	public double calculvaleur()
	{
		AssietteRond as=new AssietteRond (annee,0);
		return (as.calculvaleur()*2);
	}
	
	public boolean equals(Object o)
	{
		if(super.equals(o))
		{
			if(((AssietteCarre)o).cote==this.cote)
			{
				return true;
			}
		}
		return false;
	}
}