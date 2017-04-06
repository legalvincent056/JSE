package metier;

public class CompteEpargne extends Compte{

	
		private float taux;

		

		public CompteEpargne(int id, String nom, float solde, float taux) {
			super(id, nom, solde);
			this.taux = taux;
		}



		public CompteEpargne(float taux) {
			super();
			this.taux = taux;
		}
		
		
		
		
		//Getter et Setter de taux
		public float getTaux() {
			return taux;
		}

		public void setTaux(float taux) {
			this.taux = taux;
		}

		/**
		 * Calcul de l'int�r�t
		 * @return inter�t calcul�s 
		 */
		//calcul de l'inter�t
		
		public float calculInteret (){
			
			this.solde= solde*taux;
			
			return this.solde;
		}
		
		


		@Override
		public String toString() {
			return "CompteEpargne ["+ super.toString() +" avec un taux de=" + taux + "]";
		}
		
		
		
		
		
		
}
