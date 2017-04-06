package metier;

public class Rectangle extends Form {

	private int largeur;
	private int longueur;
	
	
	/**
	 * Constructeur du rectangle
	 * @param largeur du rectangle
	 * @param longueur du rectangle
	 */
	public Rectangle(int largeur, int longueur) {
		super();
		this.largeur = largeur;
		this.longueur = longueur;
	}

	
	/**
	 * Getter et Setter de largeur et longueur du Rectangle
	 * @return Retour de la largeur et longueur du rectangle
	 */
	
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	public int getLongueur() {
		return longueur;
	}
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}






	/**
	 * Calcul du perimetre du rectangle
	 * @return resultat du perimetre du rectangle
	 */
	public float perimetre(){
		return 2* ( largeur + longueur );
	}
	/**
	 * Calcul de la surface du rectangle
	 * @return resultat de la surface du rectangle
	 */
	public float surface(){
		return largeur * longueur ;
	}
/**
 * Affichage des résultats du rectangle
 */
	
	@Override
	public String toString() {
		return "Rectangle [la largeur est de=" + largeur + ", la longueur est de=" + longueur + ", Le perimetre=" + perimetre()
				+ ", la surface =" + surface() + ", coefficientEtallement()=" + coefficientEtallement() + "]";
	}


	
	
	
	
	
	
	
	
	
}
