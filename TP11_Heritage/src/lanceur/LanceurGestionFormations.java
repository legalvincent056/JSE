package lanceur;

import domaine.Employe;
import domaine.Manager;

public class LanceurGestionFormations {

	public static void main(String[] args) {
		
		
		//Employe employe1 = new Employe ("hugo","jojo",25);
		
		//Manager manage1 = new Manager("chef","THE",50);
		
		
		//employe1.demanderFormation("secu");
		//manage1.validerFormation();
		
		// TODO 1) Déclaration
		
		Manager manage2;
		
		// TODO 2) Instanciation, on initialise avec des valeurs par defauts
		
		manage2 = new Manager("BIG big patron","tHe",88);
		
		// TODO 3) Utilisation, nous changeons les attributs du manager en passant
		// par les propriété de la classe EMployé
		
		manage2.setPrenom("Ben Ali");
		manage2.setNom("Dembélé");
		manage2.setId(66);
		
		System.out.println(manage2);
		
	}

}
