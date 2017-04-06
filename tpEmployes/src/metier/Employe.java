package metier;

public class Employe {
	
	//déclaration attributs
	private String nom;
	private String prenom;
	private long id;


	//constructeur avec les 3 attributs	
	public Employe(String nom, String prenom, long id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}
	

	@Override //affichage par le constructeur en utilisant Source toString
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", id=" + id + "]";
	}


	public Employe() { //constructeur par defaut
		super();
	}
	
	
	
	//Assesseurs pour l'encapsulation
	
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
