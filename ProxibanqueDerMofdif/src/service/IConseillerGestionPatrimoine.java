/**
 * 
 */
package service;

import metier.Client;

/**
 * Interface ConseillerGestion Patrimoine faisant appelle à la méthode GestionPatrimoine d'un client par un conseiller
 * @author ME VLG
 * 
 *
 */
public interface IConseillerGestionPatrimoine {

	public void GestionPatrimoine(Client c);
	
	
}
