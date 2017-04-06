package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import metier.Compte;
import service.CompteService;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;


/**
 * Classe de démarrage de l'application
 * @author Super Stagiaires
 *
 */

public class Lanceur {

	
	
	/**
	 * Lanceur doit être démarré en priorité pour la création d'un compte 
	 * @param args arguments du lanceur
	 * @throws MontantNegatifException 
	 * @throws SoldeInsuffisantException 
	 */
	public static void main(String[] args) throws SoldeInsuffisantException, MontantNegatifException {
	
	
		Scanner clavier = new Scanner(System.in);
		
		// lien avec la classe service CompteService
		CompteService cs = new CompteService();
		
		
		//Créer un objet Compte
		Compte c = new Compte(0,"a", 1000);
		
		
		
		//déclaration variable
		int i;
		int lidCompte;
		long leSolde;
		String lenomCompte;
		long montant;	
		
		
		i=0;
		
		
		while(i<1 || i>4 ){
		
		
	
		//Affichage du menu
		System.out.println("---------------------------------------------------------------");
		System.out.println("MENU\n1/ Ajouter un Compte\n2/ Créditer un Compte \n3/ Débiter un Compte\n4/ Quitter l'application" );
		System.out.println("Entrez le n° du menu souhaité :");
		
		
		i = clavier.nextInt();
			
			
	try{			
		switch (i)
		{
		case 1:	
			//récupération des données saisies utilisateur
			
			System.out.println("Entrer le n° de compte : ");
			lidCompte = clavier.nextInt();
			
			System.out.println("Entrer le nom du compte : ");
			lenomCompte = clavier.next();
			
			System.out.println("Saisir solde :");
			leSolde=clavier.nextLong();
			
			//affectation des données à l'objet compte
			c.setIdCompte(lidCompte);
			c.setNomCompte(lenomCompte);
			c.setSolde(leSolde);
			
			System.out.println(c);
			//Remise à zéro de i pour continuer la boucle while.
			i=0;
		break;
		
						
		case 2:
			if(c.getIdCompte() > 0 ){
				//Saisie montant à ajouter
				System.out.println("Saisir le montant à créditer :");
				//création d'une nouvelle variable
				montant = clavier.nextLong();
				cs.ajouter(c, montant);
				//Afficher après ajout
				System.out.println(c);
			}else{
				System.out.println("Créer un compte au préalable");
				}
			i=0;
		break;
		

		case 3:
			if(c.getIdCompte() > 0) {
					
					//Saisie montant à retirer
					System.out.println("Saisir le montant à retirer :");
					//utilisation de la variable montant temporaire
					montant =clavier.nextLong();
				
					cs.retirer(c,montant);
				
					}else{
						System.out.println("Créer un compte au préalable");
					}
		
				
			
				System.out.println(c);
								
			i=0;
		break;
		
		case 4:
			System.out.println("Vous quittez le programme.");
			
		}
		
		}catch (SoldeInsuffisantException e){
			System.out.println(e.getMessage());
		} catch (MontantNegatifException e){
			System.out.println(e.getMessage());
		} catch (InputMismatchException e){
			System.out.println("Veuillez rentrer un chiffre");
		}
		

}
}
}


	
	
	

