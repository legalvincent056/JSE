package service;

public class ClientService implements IClientService , IClientVip {

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

}
