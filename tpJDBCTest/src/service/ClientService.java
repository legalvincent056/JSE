package service;

import dao.Dao;
import dao.IDao;
import metier.Client;

public class ClientService implements IClientService , IClientVip {

	private IDao idao = new Dao();
	
	@Override
	public void direBonjour() {
		// TODO Auto-generated method stub
		System.out.println("Bonjour");
	}

	@Override
	public void direAurevoir() {
		// TODO Auto-generated method stub
		System.out.println("Au revoir");
	}

	@Override
	public void jeSuisVip() {
		// TODO Auto-generated method stub
		System.out.println("Je suis VIP");
		

	}
	@Override
	public void ajouterClient(Client c) {
		// TODO Auto-generated method stub
		
		idao.ajouterClient(c);
		System.out.println("Client ajouté");
	}

}
