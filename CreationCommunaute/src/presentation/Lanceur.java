package presentation;

import java.util.Scanner;

import metier.Personne;
import service.PersonneService;
/**
 * Classe de d�marrage de l'application
 * @author Stagiaire
 *
 */
public class Lanceur {
/**
 * La m�thode main est charg�e en m�moire au d�marrage de l'application
 * et peut donc �tre utilis�e avant la cr�ation de tout objet
 * @param args Argument de la personne
 */
	public static void main(String[] args) {
		//d�claration de la couche service
		PersonneService ps = new PersonneService();
		
		
		
		//Cr�ation d'un objet personne

		Personne p = new Personne();
			//Personne (type) p (variable) est �gale � nouvelle Personne() (constructeur)
		
		
			//valorisation des attributs 2 gr�ce � un constructeur avec 3 variables
		Personne p2 = new Personne("Nom2", "Prenom2", 350);
		
			//valorisation des attributs 3 gr�ce � un constructeur avec 2 variables
				Personne p3 = new Personne("Nom3", "Prenom3");
			//valorisation de l'age pas pris en compte dans le constructeur 3
		p3.setAge(999);
		
		
	
		//valorisation des attributs �1
		p.setNom("Bernard");
		p.setPrenom("Lhermite");
		p.setAge(21);
		
		//affichage des attributs 1
		System.out.println("nom = " + p.getNom());
		
		System.out.println("prenom = " + p.getPrenom());
		
		System.out.println("age = " + p.getAge());
		
		System.out.println("--------------------------------------------");
		
		//affichage des attributs 2
				System.out.println(p2);

		System.out.println("--------------------------------------------");
				
		//affichage des attributs 3
				System.out.println(p3); //toString de la classe personne sui g�n�re automatiquement le nom dans "main".
				
		//TEST de la classe scanner pour attribut 4
				Scanner clavier = new Scanner(System.in); //Cr�er objet Scanner
				
				System.out.println("Saisir le nom :"); //Demander le nom
				String leNom = clavier.next();			//R�cup�rer le nom
				
				System.out.println("Saisir le prenom :");
				String lePrenom = clavier.next();
				
				System.out.println("Saisir l'age :");
				int lAge = clavier.nextInt();
				
				//Cr�er l'objet personne
				Personne p4 = new Personne(leNom,lePrenom,lAge);
				
				System.out.println("--------------------------------------------");
				
				//affichage des attributs 4
						System.out.println(p4);
				System.out.println("--------------------------------------------");		
				
				//affichage des m�thodes de PersonneService
						ps.marcher(p);
				System.out.println("--------------------------------------------");		
						ps.arreter(p4);
				System.out.println("--------------------------------------------");				
					System.out.println(ps.pause(p3)); 
					

				//fermer le clavier/canal
				clavier.close();		
	}

}
