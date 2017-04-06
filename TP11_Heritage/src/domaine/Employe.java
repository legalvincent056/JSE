package domaine;

public class Employe {
	
	protected String nom;
	protected String prenom;
	private int id;
	
	
	
	
	//Getter et Setter
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	//constructeur
	public Employe(String nom, String prenom, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}
	
	
	public void demanderFormation(String theme){
		System.out.println("L'employé " + prenom + nom + " demande une formation en " + theme);
	}
	
	
	
	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", id=" + id + "]";
	}
	
	
	

}
