/**
 * 
 */
package service;

import java.util.Collection;

import metier.Adresse;

import metier.Conseiller;
import metier.Gerant;

/**
 * @author Stagiaire
 *
 */
public interface IGerantConseiller {

	public void AjouterConseiller(Gerant g, Conseiller co);
	public void ModifierConseiller(Conseiller c, Adresse a, int telephone);
	public void SupprimerConseiller(Conseiller c, Gerant g);
	public void AfficherConseiller(Conseiller c);
	
}
