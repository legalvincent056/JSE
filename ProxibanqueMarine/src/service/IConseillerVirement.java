/**
 * 
 */
package service;

import metier.Compte;

/**
 * @author Stagiaire
 *
 */
public interface IConseillerVirement {

	
	public void EffectuerVirement(Compte c1, Compte c2, int montant);
	
}
