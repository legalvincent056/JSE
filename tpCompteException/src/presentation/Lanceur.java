package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import metier.Compte;
import service.CompteService;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;


/**
 * Classe de d�marrage de l'application
 * @author Super Stagiaires
 *
 */

public class Lanceur {

	
	
	/**
	 * Lanceur doit �tre d�marr� en priorit� pour la cr�ation d'un compte 
	 * @param args arguments du lanceur
	 * @throws MontantNegatifException 
	 * @throws SoldeInsuffisantException 
	 */
	public static void main(String[] args) throws SoldeInsuffisantException, MontantNegatifException {
	
	
		Scanner clavier = new Scanner(System.in);
		
		// lien avec la classe service CompteService
		CompteService cs = new CompteService();
		
		
		//Cr�er un objet Compte
		Compte c = new Compte(0,"a", 1000);
		
		
		
		//d�claration variable
		int i;
		int lidCompte;
		long leSolde;
		String lenomCompte;
		long montant;	
		
		
		i=0;
		
		
		while(i<1 || i>4 ){
		
		
	
		//Affichage du menu
		System.out.println("---------------------------------------------------------------");
		System.out.println("MENU\n1/ Ajouter un Compte\n2/ Cr�diter un Compte \n3/ D�biter un Compte\n4/ Quitter l'application" );
		System.out.println("Entrez le n� du menu souhait� :");
		
		
		i = clavier.nextInt();
			
			
	try{			
		switch (i)
		{
		case 1:	
			//r�cup�ration des donn�es saisies utilisateur
			
			System.out.println("Entrer le n� de compte : ");
			lidCompte = clavier.nextInt();
			
			System.out.println("Entrer le nom du compte : ");
			lenomCompte = clavier.next();
			
			System.out.println("Saisir solde :");
			leSolde=clavier.nextLong();
			
			//affectation des donn�es � l'objet compte
			c.setIdCompte(lidCompte);
			c.setNomCompte(lenomCompte);
			c.setSolde(leSolde);
			
			System.out.println(c);
			//Remise � z�ro de i pour continuer la boucle while.
			i=0;
		break;
		
						
		case 2:
			if(c.getIdCompte() > 0 ){
				//Saisie montant � ajouter
				System.out.println("Saisir le montant � cr�diter :");
				//cr�ation d'une nouvelle variable
				montant = clavier.nextLong();
				cs.ajouter(c, montant);
				//Afficher apr�s ajout
				System.out.println(c);
			}else{
				System.out.println("Cr�er un compte au pr�alable");
				}
			i=0;
		break;
		

		case 3:
			if(c.getIdCompte() > 0) {
					
					//Saisie montant � retirer
					System.out.println("Saisir le montant � retirer :");
					//utilisation de la variable montant temporaire
					montant =clavier.nextLong();
				
					cs.retirer(c,montant);
				
					}else{
						System.out.println("Cr�er un compte au pr�alable");
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


	
	
	

