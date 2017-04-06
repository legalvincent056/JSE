/**
 * 
 */
package service;

import java.util.Collection;

import metier.Client;

/**
 * Interface GerantAgence fait appel à la fonction AuditerAgence pour un ensemble de client d'une agence par un Gérant
 * @author ME VLG
 *
 */
public interface IGerantAgence {

	public void AuditerAgence(Collection <Client> tousLesClients);
	
}
