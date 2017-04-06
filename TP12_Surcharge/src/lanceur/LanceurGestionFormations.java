package lanceur;

import domaine.DemandeFormation;
import domaine.Manager;

public class LanceurGestionFormations {

	public static void main(String[] args) {


		Manager man = new Manager();
		
		man.demanderFormation(" mars 2023", "juillet 2024");
		
		System.out.println(man);
		
	
		DemandeFormation DF1 = new DemandeFormation("janvier2015", "Peut être");
		
		System.out.println(DF1);
			
		
		
		
}
}
			
	
		
		

	


