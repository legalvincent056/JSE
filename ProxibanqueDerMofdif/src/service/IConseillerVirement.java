/**
 * 
 */
package service;

import metier.Compte;

/**
 * Interface ConseillerVirement fait appel � la m�thode EffectuerVirement entre 2 comptes pour un montant donn� par le conseiller
 * @author ME VLG
 *
 */
public interface IConseillerVirement {

	
	public void EffectuerVirement(Compte c1, Compte c2, int montant);
	
}
