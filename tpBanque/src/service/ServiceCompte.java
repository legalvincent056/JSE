package service;

import metier.Compte;

public class ServiceCompte {
	
	public long ajouter (Compte com, long montant){
		
		if (montant>0)
			{
			com.setSolde(com.getSolde() + montant);
			}
		else
			{
			System.out.println("Montant insuffisant");
			}
		return com.getSolde();
	}
	
	
	public long soustraire (Compte com, long montant){
		
		if(montant>=0)
			{
			if (montant <= com.getSolde()){
				com.setSolde(com.getSolde() - montant);
			}
		else
			{
				System.out.println("Le solde n'est pas suffisant...");
			}
			}		
		return com.getSolde();
	}
	
	
	

}
