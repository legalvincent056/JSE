package domaine;

public class Manager extends Employe {

	public Manager(String nom, String prenom, int id) {
		super(nom, prenom, id);
		
	}

	
	public void validerFormation(){
		
		System.out.println("La Formation est valid�e par le manager " + prenom +" "+ nom);
	}
	
	
	
}
