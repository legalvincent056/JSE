/**
 * 
 */
package service;

/**
 * Interface ConseillerSimulation faisant appelle la methode EffectuerSimulationCr�dit par un conseiller
 * @author ME VLG
 *
 */
public interface IConseillerSimulation {

	public double EffectuerSimulationCredit (double montant, int taux, int duree);
	
	
}
