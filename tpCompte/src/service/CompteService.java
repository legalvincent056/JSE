package service;



import metier.Compte;


public class CompteService {
	
	
	public long ajouter (Compte c, long sommeAjout){
		
		if (sommeAjout>=0){
			c.setSolde(c.getSolde()+sommeAjout);
			//return c.getSolde();
		}
			return c.getSolde();
	}
	
	public long retirer (Compte c, long sommeMoins)  {
				
		if (sommeMoins >= 0)
		{
			if(sommeMoins <= c.getSolde())
			{
				c.setSolde(c.getSolde() - sommeMoins);
			
			}
			
		}
		;
		
		
		return c.getSolde();
	}


}
