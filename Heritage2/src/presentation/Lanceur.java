package presentation;

import metier.Compte;
import metier.CompteEpargne;
import metier.ComptePayant;
import metier.CompteSimple;

public class Lanceur {

	public static void main(String[] args) {
		
		//Compte mère Compte
		Compte c = new Compte();
		c.setId(200);
		c.setNom("TestCompte");
		c.setSolde(0);
				
		System.out.println(c);
		
		Compte c1 = new Compte();
		c1.setId(250);
		c1.setNom("TestCompte2");
		c1.setSolde(100);
		
		c1.verser(300);
		
		System.out.println(c1);
		
		
		
		System.out.println("---------------------------------");
		
		//Compte Simple
		CompteSimple cs = new CompteSimple(100);
		cs.setId(1);
		cs.setNom("Compte Simple");
		cs.setSolde(100);
		
		System.out.println(cs);
		
		System.out.println("---------------------------------");

		//Compte Epargne
		CompteEpargne ce = new CompteEpargne(20);
		ce.setId(2);
		ce.setNom("Compte Epargne");
		ce.setSolde(200);
				
		System.out.println(ce);
		
		System.out.println("---------------------------------");
		
		//Compte Payant
		ComptePayant cp = new ComptePayant(30);
		cp.setId(3);
		cp.setNom("Compte Payant");
		cp.setSolde(300);
		
		System.out.println(cp);
		
		
		
			

	}

}
