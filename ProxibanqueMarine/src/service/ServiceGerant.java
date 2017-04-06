package service;

import java.util.Collection;
import java.util.Iterator;

import metier.Adresse;
import metier.Client;
import metier.Conseiller;
import metier.Gerant;

public class ServiceGerant implements IGerantAgence, IGerantConseiller {


	@Override
	public void AjouterConseiller(Gerant g, Conseiller co) {
		
		Collection<Conseiller> col = g.getMesConseillers();
		col.add(co);
		g.setMesConseillers(col);
		co.setMonGerant(g);
		
	}


	@Override
	public void ModifierConseiller(Conseiller c, Adresse a, int telephone) {
		
		c.setSonAdresse(a);
		c.setTelephone(telephone);
		
	}


	@Override
	public void SupprimerConseiller(Conseiller c, Gerant g) {

	
		Collection<Conseiller> col1 = g.getMesConseillers();
		col1.remove(c);
		g.setMesConseillers(col1);
	
		
	}


	@Override
	public void AfficherConseiller(Conseiller c) {
		System.out.println(c);
	}


	@Override
	public boolean AuditerAgence(Collection<Client> tousLesClientsConseillers) {
		boolean x=true;
		
		
		
			for(Client c : tousLesClientsConseillers)
				{
				System.out.println(c.getTypeClient());
				System.out.println(c.getMonCompteCourant().getSolde());
				//System.out.println(c.getMonCompteEpargne().getSolde());
				
			if(c.getTypeClient()==1)
					{
						if(c.getMonCompteCourant().getSolde()!=0)
						{
							if(c.getMonCompteCourant().getSolde()<-5000)
							{
								x=false;
								System.out.println(x);
							}	
							else
							{
								
							}
						}
						else
						{
							if(c.getMonCompteEpargne().getSolde()!=0)
							{
								if(c.getMonCompteEpargne().getSolde()<-5000)
								{
									x=false;
									System.out.println(x);
								}
								else
								{
									
								}
							}
						}
					}
			else
				{
				if(c.getTypeClient()==2)
				{
					if(c.getMonCompteCourant().getSolde()!=0)
					{
						if(c.getMonCompteCourant().getSolde()<-50000)
						{
							x=false;
							System.out.println(x);
						}	
						else
						{
							
						}
					}
					
					else
					{
						if(c.getMonCompteEpargne().getSolde()!=0)
						{
							if(c.getMonCompteEpargne().getSolde()<-50000)
							{
								x=false;
								System.out.println(x);
							}
							else
							{
								
							}
						}
					}
				}
				}
				}
		
		return x;
		}
}

			


	

	
