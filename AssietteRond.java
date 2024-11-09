package collection;
import java.time.LocalDate;
public class AssietteRond extends assiette {
	private double rayon;
	public AssietteRond(int annee,double rayon) {
		super(annee);
		this.rayon=rayon;
	}
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	@Override
	public String toString() {
		return "AssietteRond [rayon=" + rayon + "]";
	}
	public double calculesurface() {
		return 3.14 * rayon * rayon ;
		
	}
	 public double calculvaleur() {
		 if((LocalDate.now().getYear()-annee)>50) {
			 return ((LocalDate.now().getYear()- annee- 50) * 1);
		 }
		 else {
			 return 0;
		 }

		
	 }
	 public boolean equals(Object o)
		{
			if(super.equals(o))
			{
				if(((AssietteRond)o).rayon==this.rayon)
				{
					return true;
				}
			}
			return false;
	 

}}
