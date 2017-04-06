/**
 * 
 */
package service;

import metier.CarteVisa;
import metier.Client;
import metier.Compte;

/**
 * @author Stagiaire
 *
 */
public interface IConseillerCarteVisa {

	public void ActivationCarteVisa(Compte c, CarteVisa cv);
	
	public void DesactivationCarteVisa(Compte c, CarteVisa cv);
	
}
