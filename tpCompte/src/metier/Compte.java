package metier;
/**
 * Classe définissant le compte client
 * @author VLG
 * @version 1.0
 */
public class Compte {
	
	private int idCompte;
	private String nomCompte;
	private long solde;
	
	/**
	 * Liste des attributs de compte
	 * @param idCompte correspond à son numéro
	 * @param nomCompte correspond à son nom
	 * @param solde correspond au solde du compte
	 */
	
	
	//Constructeur avec les 3 attributs 
		
	public Compte(int idCompte, String nomCompte, long solde) {
		super();
		this.idCompte = idCompte;
		this.nomCompte = nomCompte;
		this.solde = solde;
	}
	
	
	
	//Getter & Setter de mes attributs privés
		
	
	/**
	 * Getter du n° de compte
	 * @return correspond au n° de compte
	 */
	
	public int getIdCompte() {
		return idCompte;
	}
	/**
	 * Setter du n° de compte
	 * @param idCompte correspond au n° de compte
	 */
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	/**
	 * Getter Nom du compte
	 * @return correspond au nom du compte associé
	 */
	public String getNomCompte() {
		return nomCompte;
	}
	/**
	 * Setter Nom du compte
	 * @param nomCompte est le nom du compte
	 */
	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}
	
	/**
	 * Getter du solde
	 * @return correspond au montant du compte
	 */
	public long getSolde() {
		return solde;
	}
	
	/**
	 * Setter du solde
	 * @param solde correspond au montant du compte
	 */
	public void setSolde(long solde) {
		this.solde = solde;
	}

	/**
	 * Va afficher les résultat avec le constructeur
	 */
	//Affichage du résultat
	@Override
	public String toString() {
		return "Votre Compte [n° de compte=" + idCompte + ", Nom du compte=" + nomCompte + ", Solde=" + solde + "]";
	}
	
	
	
	
	
	
	
	
	

}
