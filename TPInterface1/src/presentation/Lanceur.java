package presentation;

import service.ClientService;
import service.IClientService;
import service.IClientVip;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//déclaration de l'Interface normale
		IClientService s = new ClientService();
		
		// déclaration de l'Interfacce Vip
		IClientVip v = new ClientService();
		
		//declaration de la classe
		ClientService cs = new ClientService();
		
		
		//utilisation de l'interface normale
		s.direBonjour();
		//s.jeSuisVip(); ne fonctionne plus car l'interface IClientService n'a plus la methode VIP-> Elle se trouve dans l'interface IClientVip
		s.direAurevoir();
		
		System.out.println("-------------------------");
		
		//utilisation de la classe
		cs.direBonjour();
		cs.direAurevoir();
		cs.jeSuisVip();
		
		System.out.println("---------------------------");
		
		//utlisation de l'Interface Vip
		v.direBonjour();
		v.direAurevoir();
		v.jeSuisVip();
		
	}

}
