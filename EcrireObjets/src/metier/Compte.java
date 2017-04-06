package metier;

import java.io.Serializable;

/**
 * Classe définissant le compte client
 * @author VLG
 * @version 1.0
 */
public class Compte implements Serializable {
	
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
	
	
	
	public Compte() {
		super();
	}





	//Getter & Setter de mes attributs privés
	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public String getNomCompte() {
		return nomCompte;
	}

	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}

	public long getSolde() {
		return solde;
	}

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
