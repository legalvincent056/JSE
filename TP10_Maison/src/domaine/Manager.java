package domaine;

public class Manager {
	
	private String nomManag;
	private String prenomManag;
	private int idManag;
	
	
	
	
	//Constructeur avec 3 attributs
	
	public Manager(String nomManag, String prenomManag, int idManag) {
		super();
		this.nomManag = nomManag;
		this.prenomManag = prenomManag;
		this.idManag = idManag;
	}

	//methode Demande Formation
	public void demanderFormation(String theme){
		
		System.out.println("Le Manager " + prenomManag +" "+nomManag + " DEMANDE une formation en " + theme);
	}
	
	//methode Validation de la formation
	public void validerFormation (){
		System.out.println("Le Manager " + prenomManag +" "+nomManag + " VALIDE une formation");
	}
	
	
	
	// Getter et Setters
	public String getNomManag() {
		return nomManag;
	}
	public void setNomManag(String nomManag) {
		nomManag = nomManag;
	}
	public String getPrenomManag() {
		return prenomManag;
	}
	public void setPrenomManag(String prenomManag) {
		prenomManag = prenomManag;
	}
	public int getIdManag() {
		return idManag;
	}
	public void setIdManag(int idManag) {
		this.idManag = idManag;
	}
	
	
	
	
	

}
