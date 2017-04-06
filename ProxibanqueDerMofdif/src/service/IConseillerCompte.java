/**
 * 
 */
package service;

import metier.Client;
import metier.Compte;
import metier.CompteCourant;
import metier.CompteEpargne;

/**
 * Interface ConseillerCompte faisant appelle aux méthodes d'Ajout/Suppression/Affichage d'un Compte par un Conseiller
 * @author ME VLG
 * *
 */
public interface IConseillerCompte {

	public void AjouterCompteClient (Client c, Compte co);
	public void SupprimerCompteClient (Compte compte, Client c);
	public void AfficherCompteClient (Compte compte);
	
	
}
