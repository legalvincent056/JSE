package domaine;

public class Employe {

	private int id;
	private String nom;
	private String prenom;
	
	//Constructeurs 3  arguments
	public Employe(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	//Constructeur 2 arguments
	public Employe(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = 007;
	}


	// COntructeur 1 argument
	public Employe(String nom) {
		super();
		this.nom = nom;
		this.prenom = "Simon";
		this.id = 006;
	}

	//Constructeur 0 argument
	public Employe() {
		super();
		this.nom = "Gégé";
		this.prenom = "Chez";
		this.id= 005;
		
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


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * Demande de Formation	
	 * @param prenom Prenom de l'employé
	 * @param nom Nom de l'employé
	 */
	public void demanderFormation(String prenom, String nom){
		System.out.println("L'employé " + prenom +" "+ nom + "demande une formation.");
	}


	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	
	
	
	
}
