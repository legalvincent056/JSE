package metier;

public class Ellipse extends Form {

	private int grandAxe;
	private int petitAxe;
	
	
	
	/**
	 * Constructeur de l'Ellipse
	 * @param grandAxe Grand axe de l'ellipse
	 * @param petitAxe Petit axe de l'ellipse
	 */
	public Ellipse(int grandAxe, int petitAxe) {
		super();
		this.grandAxe = grandAxe;
		this.petitAxe = petitAxe;
	}
	/**
	 * Getter et Setter du Grand Axe et Petit Axe de l'ellipse
	 * @return Retour de Grand Axe et petit Axe de l'Elipse 
	 */
	
	public int getGrandAxe() {
		return grandAxe;
	}

	public void setGrandAxe(int grandAxe) {
		this.grandAxe = grandAxe;
	}

	public int getPetitAxe() {
		return petitAxe;
	}

	public void setPetitAxe(int petitAxe) {
		this.petitAxe = petitAxe;
	}


	/**
	 * Calcul du perimetre de l'ellipse
	 */
	public float perimetre(){
		return (float)(Math.PI * Math.sqrt(2*((petitAxe*petitAxe)+(grandAxe*grandAxe))));
	}
	
	/**
	 * Calcul de la surface de l'ellipse
	 */
	public float surface(){
		
		return (float) Math.PI * petitAxe * grandAxe;
	}

	@Override
	public String toString() {
		return "Ellipse [Le grandAxe de l'ellipse est de=" + grandAxe + ", le petitAxe est de=" + petitAxe + ", le perimetre=" + perimetre()
				+ ", la surface=" + surface() + ", coefficientEtallement()=" + coefficientEtallement() + "]";
	}
	
	
	
}
