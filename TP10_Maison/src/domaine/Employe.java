package domaine;

public class Employe {

	/**
	 * Décalaration des attributs nom/prenom/id de l'employé	
	 */
	private String nom;
	private String prenom;
	private int id;
	
	
	//Constructeur avec 3 attributs
	public Employe(String nom, String prenom, int id) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.id = id;
}
	
	
	/**
	 * Getter et Setter du nom de l'employé
	 * @return Retour du nom de l'employé
	 */
	
	//Getter et Setter
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	

	
	
	/**
	 * Getter et Setter du prenom de l'employé
	 * @return Retour du prenom de l'employé
	 */
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	/**
	 *Getter et Setter de l'identifiant de l'employé 
	 * @return Retour de l'identifiant Employé
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//methode demander formation
	public void demanderFormation(String theme){
		System.out.println("L'employé " + prenom +" "+nom + " demande une formation en " + theme);
	}
	
	
	
	
}
