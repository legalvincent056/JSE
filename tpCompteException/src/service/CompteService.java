package service;



import metier.Compte;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

public class CompteService {
	
	
	public long ajouter (Compte c, long sommeAjout){
		
		if (sommeAjout>=0){
			c.setSolde(c.getSolde()+sommeAjout);
			//return c.getSolde();
		}
			return c.getSolde();
	}
	
	public long retirer (Compte c, long sommeMoins) throws SoldeInsuffisantException, MontantNegatifException {
				
		if (sommeMoins >= 0)
		{
			if(sommeMoins <= c.getSolde())
			{
				c.setSolde(c.getSolde() - sommeMoins);
			
			}
			else throw new SoldeInsuffisantException("SOLDE INSUFFISANT");
		}
		else throw new MontantNegatifException("Montant Negatif");
		
		
		return c.getSolde();
	}


}
