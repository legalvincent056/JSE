package presentation;

import java.util.Scanner;

import metier.Personne;
import service.PersonneService;
/**
 * Classe de démarrage de l'application
 * @author Stagiaire
 *
 */
public class Lanceur {
/**
 * La méthode main est chargée en mémoire au démarrage de l'application
 * et peut donc être utilisée avant la création de tout objet
 * @param args Argument de la personne
 */
	public static void main(String[] args) {
		//déclaration de la couche service
		PersonneService ps = new PersonneService();
		
		
		
		//Création d'un objet personne

		Personne p = new Personne();
			//Personne (type) p (variable) est égale à nouvelle Personne() (constructeur)
		
		
			//valorisation des attributs 2 grâce à un constructeur avec 3 variables
		Personne p2 = new Personne("Nom2", "Prenom2", 350);
		
			//valorisation des attributs 3 grâce à un constructeur avec 2 variables
				Personne p3 = new Personne("Nom3", "Prenom3");
			//valorisation de l'age pas pris en compte dans le constructeur 3
		p3.setAge(999);
		
		
	
		//valorisation des attributs ²1
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
				System.out.println(p3); //toString de la classe personne sui génère automatiquement le nom dans "main".
				
		//TEST de la classe scanner pour attribut 4
				Scanner clavier = new Scanner(System.in); //Créer objet Scanner
				
				System.out.println("Saisir le nom :"); //Demander le nom
				String leNom = clavier.next();			//Récupérer le nom
				
				System.out.println("Saisir le prenom :");
				String lePrenom = clavier.next();
				
				System.out.println("Saisir l'age :");
				int lAge = clavier.nextInt();
				
				//Créer l'objet personne
				Personne p4 = new Personne(leNom,lePrenom,lAge);
				
				System.out.println("--------------------------------------------");
				
				//affichage des attributs 4
						System.out.println(p4);
				System.out.println("--------------------------------------------");		
				
				//affichage des méthodes de PersonneService
						ps.marcher(p);
				System.out.println("--------------------------------------------");		
						ps.arreter(p4);
				System.out.println("--------------------------------------------");				
					System.out.println(ps.pause(p3)); 
					

				//fermer le clavier/canal
				clavier.close();		
	}

}
