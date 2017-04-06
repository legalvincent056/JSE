package metier;

public class CompteSimple extends Compte {

	private float decouvert;

	
	//constructeur ou l'on n'utilise pas les arguments
	public CompteSimple(float decouvert) {
		super();
		this.decouvert = decouvert;
	}

	
	// Classe fille où on utilise les arguments de la classe mère
	public CompteSimple(int id, String nom, float solde, float decouvert) {
		super(id, nom, solde);
		this.decouvert = decouvert;
	}

	
	//Getter et Setter de decouvert

	public float getDecouvert() {
		return decouvert;
	}


	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}
	
	
	//retirer
	
	
	@Override
	public float retirer (float mt) {
		if(mt>=0){
			if (mt <= solde + decouvert){
			
				this.solde = (solde - mt);			
			}
		} 
		return solde;
	}
	
	
	
	
	@Override
	public String toString() {
		return "CompteSimple [decouvert=" + super.toString() + "Découvert = " + decouvert + "]";
	} //super.toString -> toString de la classe mère



	
	
	
	
}
