package metier;

public class Compte {

	private int id;
	private String nom;
	private float solde;
	
	
	//constructeur
	public Compte() {
		super();
	}

	
	//Getter et Setter de la classe
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

	
	
	public float verser (float mt){
		
		this.solde = solde + mt;
		
		return this.solde;
		
	}
	
	
	
	
	
	
	

	//affichage
	@Override
	public String toString() {
		return " Compte [getId()= " + getId() + ", getNom()= " + getNom() + ", getSolde()= " + getSolde() + " ]";
	}
	
	
	
	
	
	
	
	
}
