/**
 * 
 */
package service;

import java.util.Collection;

import metier.Adresse;

import metier.Conseiller;
import metier.Gerant;

/**
 * Interface GerantConseiller permettant au Gérant de :Ajouter/Modifier/Supprimer/Afficher un conseiller de son agence
 * @author ME VLG
 *
 */
public interface IGerantConseiller {

	public void AjouterConseiller(Gerant g, Conseiller co);
	public void ModifierConseiller(Conseiller c, Adresse a, int telephone);
	public void SupprimerConseiller(Conseiller c, Gerant g);
	public void AfficherConseiller(Conseiller c);
	
}
