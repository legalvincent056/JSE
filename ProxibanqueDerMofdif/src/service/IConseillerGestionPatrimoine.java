/**
 * 
 */
package service;

import metier.Client;

/**
 * Interface ConseillerGestion Patrimoine faisant appelle � la m�thode GestionPatrimoine d'un client par un conseiller
 * @author ME VLG
 * 
 *
 */
public interface IConseillerGestionPatrimoine {

	public void GestionPatrimoine(Client c);
	
	
}
