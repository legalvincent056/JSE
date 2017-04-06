package metier;

public class ComptePayant extends Compte{
	
	private float pourcentage;

	public ComptePayant(int id, String nom, float solde, float pourcentage) {
		super(id, nom, solde);
		this.pourcentage = pourcentage;
	}

		
	
	
	
	public ComptePayant(float pourcentage) {
		super();
		this.pourcentage = pourcentage;
	}



	//Getter et Setter de pourcentage

	public float getPourcentage() {
		return pourcentage;
	}



	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}


	
	
	

	@Override
	public float verser(float mt) {
		if(mt>=0)
		{
			this.solde = solde + mt - (mt*pourcentage)/100;
		}				
		return solde;
	}



	@Override
	public float retirer(float mt) {
		if(mt>=0){
			if (mt+(mt*pourcentage)/100 <= solde){
			
			this.solde = this.solde - mt -((mt*pourcentage)/100);
			}		
		}				
		return solde;
	}



	@Override
	public String toString() {
		return "ComptePayant ["+ super.toString() + "avec un pourcentage=" + pourcentage + "]";
	}
	
	
	

}
