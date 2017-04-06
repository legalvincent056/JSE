package metier;

public abstract class Compte {
	
	private int id;
	private String nom;
	protected float solde;
	private static int nbComptes;
	//private final float PI =3.14f;
	
	//création constructeur sans argument
	public Compte() {
		super();
		nbComptes = nbComptes +1;
		//PI=3.18f;
		
	}
	
	
	//création constructeur avec argument -pour utiliser les arguments dans la classe fille
	public Compte(int id, String nom, float solde) {
		super();
		this.id = id;
		this.nom = nom;
		this.solde = solde;
		
		nbComptes = nbComptes +1;
	}

	
	
	//Getter et Setter
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public float getSolde() {
		return solde;
	}


	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	
	
	

	public static int getNbComptes() {
		return nbComptes;
	}


	public static void setNbComptes(int nbComptes) {
		Compte.nbComptes = nbComptes;
	}


	/**
	 * méthode verser
	 * @param mt montant à verser
	 * @return solde après versement
	 */
		
	//méthode verser
		
	public float verser (float mt){
		
		if(mt>=0)
		{
			this.solde += mt;
		}				
		return this.solde;
	}
	
	/**
	 * méthode retirer
	 * @param mt montant à retirer
	 * @return solde après retrait
	 */
	
	//méthode retirer en mode abstrait. 
	
	public abstract float retirer(float mt);
	/*{
		
		if(mt>=0){
			if (mt <= solde){
			
			this.solde -= mt;
		}		
		}				
		return solde;
	
	}*/
	
	//affichage

	@Override
	public String toString() {
		return "Compte [id=" + id + ", nom=" + nom + ", solde=" + solde + "]";
	
	}
}
