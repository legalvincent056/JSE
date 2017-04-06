package metier;

public class Carre extends Form {

	private int dimCote;

	public Carre(int dimCote) {
		super();
		this.dimCote = dimCote;
	}
	/**
	 * Getter et Setter du Carre
	 * @return Retour de dimCote
	 */
	
	public int getDimCote() {
		return dimCote;
	}

	public void setDimCote(int dimCote) {
		this.dimCote = dimCote;
	}



	/**
	 * Calcul permiètre
	 */
	public float perimetre(){
		return 2* ( dimCote + dimCote );
				
	}
	
	/**
	 * Calcul surface
	 */
	public float surface(){
		
		return dimCote * dimCote ;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Carre [La dimension du cote est de " + dimCote + ", le perimetre =" + perimetre() + ", la surface=" + surface()
				+ ", coefficientEtallement =" + coefficientEtallement() + "]";
	}
	
	
	
		
	
}
