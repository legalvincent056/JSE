package domaine;

public class Manager extends Employe{

	
	
	public Manager(int id, String nom, String prenom) {
		super(id, nom, prenom);
		
	}
	
	public Manager(String nom, String prenom) {
		this(0, prenom,nom);
		
	}
	
	public Manager(String nom) {
		this(0,"Gerard",nom);
	}
	
	public Manager() {
		this(3," Michel "," Mimi ");
		
	}

	
	
	/*public void demanderFormation(String prenom, String nom) {
		System.out.println("Le Manager " + prenom + nom +" demande une formation") ;
		
	}*/
	
	
	
	public void demanderFormation(String dateDebut, String dateFin){
		super.demanderFormation(getNom(), getPrenom());
		System.out.println("a la date de début" + dateDebut + " jusqu'à " + dateFin);
	}
	

	@Override
	public String toString() {
		return "Manager [getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", toString()=" + super.toString()
				+ "]";
	}


	
			
		
}
