/**
 * 
 */
package service;

/**
 * Interface ConseillerSimulation faisant appelle la methode EffectuerSimulationCrédit par un conseiller
 * @author ME VLG
 *
 */
public interface IConseillerSimulation {

	public double EffectuerSimulationCredit (double montant, int taux, int duree);
	
	
}
