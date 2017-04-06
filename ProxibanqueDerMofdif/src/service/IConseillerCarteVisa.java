/**
 * 
 */
package service;

import metier.CarteVisa;
import metier.Client;
import metier.Compte;

/**
 * Interface ConseillerCarteVisa faisant appelle aux méthodes d'activation et désactivation de la CarteVisa par le Conseiller
 * @author ME VLG
 *
 */
public interface IConseillerCarteVisa {

	public void ActivationCarteVisa(Compte c, CarteVisa cv);
	
	public void DesactivationCarteVisa(Compte c, CarteVisa cv);
	
}
