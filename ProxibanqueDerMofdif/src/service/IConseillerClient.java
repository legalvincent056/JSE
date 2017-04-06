package service;

import metier.Adresse;
import metier.Client;
import metier.Conseiller;
/**
 * 
 * Interface ConseillerClient faisant appelle aux méthodes d'Ajout/Modification/Suppression/Affichage d'un client par un Conseiller
 * @author ME VLG
 *
 *
 */
public interface IConseillerClient {

	
	public void AjouterClient(Conseiller co, Client c);
	public void ModifierClient(Client c, Adresse a, int telephone);
	public void SupprimerClient (Client c, Conseiller co);
	public void AfficherClient(Client c);
	
	
	
}
