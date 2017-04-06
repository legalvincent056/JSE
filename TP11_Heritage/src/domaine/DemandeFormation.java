package domaine;

public class DemandeFormation {

	private String dateDebut;
	private String dateDemande;
	private String dateFin;
	private String etatValidation;
	
	
	
	
	
	
	//Constructeur à 3 attributs
	
	public DemandeFormation(String dateDebut, String dateDemande, String dateFin) {
		super();
		this.dateDebut = dateDebut;
		this.dateDemande = dateDemande;
		this.dateFin = dateFin;
	}
	//Getter et Setter
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateDemande() {
		return dateDemande;
	}
	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	public String getEtatValidation() {
		return etatValidation;
	}
	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}
	
	
	
}
