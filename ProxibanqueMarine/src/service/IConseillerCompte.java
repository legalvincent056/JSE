/**
 * 
 */
package service;

import metier.Client;
import metier.Compte;
import metier.CompteCourant;
import metier.CompteEpargne;

/**
 * @author Stagiaire
 *
 */
public interface IConseillerCompte {

	public void AjouterCompteClient (Client c, Compte co);
	public void SupprimerCompteClient (Compte compte, Client c);
	public void AfficherCompteClient (Compte compte);
	
	
}
