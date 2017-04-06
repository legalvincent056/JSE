package domaine;

public class DemandeFormation {
	
	private String dateDebut;
	private String dateDemande;
	private String dateFin;
	private String etatValidation;
	
	public final static String REFUS = "refus";
	public final static String ACCODE = "valide";
	public final static String ATTENTE = "en attente";
	
	
	
	//Constructeur
	public DemandeFormation(String dateDebut, String dateDemande, String dateFin) {
		super();
		this.dateDebut = dateDebut;
		this.dateDemande = dateDemande;
		this.dateFin = dateFin;
	}



	public DemandeFormation(String dateDemande, String etatValidation) {
		this(dateDemande,etatValidation,DemandeFormation.ACCODE);
	
	}



	@Override
	public String toString() {
		return "DemandeFormation [dateDebut=" + dateDebut + ", dateDemande=" + dateDemande + ", dateFin=" + dateFin
				+"]";
	}





	
	
	
	

}
