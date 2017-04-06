package metier;

public class CompteEpargne extends Compte{
	
	private float taux;

		
	//getter et setter
	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}
	
	
	
	public CompteEpargne(float taux) {
		super();
		this.taux = taux;
	}

	//affichage
	@Override
	public String toString() {
		return "CompteEpargne ["+ super.toString() + "getTaux()=" + getTaux() + "]";
	}
	
	
	
	
}
