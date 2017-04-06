package metier;

public class ComptePayant extends Compte{
	
	private float pourcentage;

	//getter et setter
	public float getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}

	//constructeur
	public ComptePayant(float pourcentage) {
		super();
		this.pourcentage = pourcentage;
	}

	@Override
	public String toString() {
		return "ComptePayant [ "+ super.toString() +" getPourcentage()=" + getPourcentage() + " ]";
	}
	
	
	//affichage
	
	

}
