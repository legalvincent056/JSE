package presentation;

import metier.Paire;
import metier.PaireGenerique;

public class Lanceur {

	public static void main(String[] args) {
		
		//exemple sans genericite
		Paire p = new Paire("abc","xyz");
		
		String x = (String) p.getPremier();
		
		//Double y = (Double) p.getSecond();

		System.out.println("x = " + x);
		//System.out.println("y =" + y);
	
	
	//exemple avec généricité
	
	PaireGenerique<String> pg = new PaireGenerique<>("aze","rty");
	String a = pg.getPremier();
	//Double b = pg.getSecond();
	

	System.out.println("a = " + a);
	//System.out.println("b = " + b);
	
	
	PaireGenerique<Integer> pg2 = new PaireGenerique(65,12);
	System.out.println(pg2);
	
	
	}	

}
