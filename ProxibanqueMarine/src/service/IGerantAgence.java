/**
 * 
 */
package service;

import java.util.Collection;

import metier.Client;

/**
 * @author Stagiaire
 *
 */
public interface IGerantAgence {

	public boolean AuditerAgence(Collection <Client> tousLesClients);
	
}
