package metier;

public class CompteSimple extends Compte {
	
	private float decouvert;

	
	
	
	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	//constructeur decouvert
	public CompteSimple(float decouvert) {
		super();
		this.decouvert = decouvert;
	}

	
	
	@Override
	public String toString() {
		return "CompteSimple [decouvert= "+ decouvert + super.toString() + " ]";
	}
	
	
	
	

}
