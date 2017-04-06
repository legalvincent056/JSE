package presentation;

import metier.Personne;
import metier.Voiture;
import service.IService;
import service.Service;

public class Lanceur {

	public static void main(String[] args) {
		
		//déclarer le service
		IService service = new Service();
		
		//personne
		Personne p = new Personne();
		p.setIdPersonne(1);
		p.setNom("Lenommage");
		p.setPrenom("Gerard");
		
		//voiture 1
		Voiture v = new Voiture();
		v.setCouleur("Rouge");
		v.setIdVoiture(1);
		v.setMarque("Bentley");
		
		
		//voiture 2
		Voiture v2 = new Voiture();
		v2.setCouleur("Vert Fluo");
		v2.setIdVoiture(2);
		v2.setMarque("Pijot");
		
		System.out.println(p);
		
		System.out.println("----------------------------------------------------");
		
		service.ajouterVoiture(p, v);
		
		System.out.println(p);
		System.out.println("----------------------------------------------------");
		service.ajouterVoiture(p, v2);
		
		System.out.println(p);
	}

}
