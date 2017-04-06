package presentation;

import metier.Compte;
import metier.CompteEpargne;
import metier.ComptePayant;
import metier.CompteSimple;

public class Lanceur {

	public static void main(String[] args) {
		
		//Compte.java
		
		Compte c = new Compte(1, "testcompte", 10000);
		
		
		
		//Compte simple
		CompteSimple cs = new CompteSimple(2, "testCompteSimple", 1000, 1000);
		
		cs.retirer(999);
		
		
		System.out.println(c);
		System.out.println(cs);
		
		System.out.println("----------------------------------------------");
		
		
		//Compte epargne
		
		CompteEpargne ce = new CompteEpargne(0.02f);
		
		ce.setId(123);
		ce.setNom("popo");
		ce.setSolde(10000);
		
		ce.calculInteret();
			
		
		System.out.println(ce);
					
		
		
		System.out.println("----------------------------------------------");
		
		int lid = 456;
		String leNom = "ComptePayant";
		float leSolde=0;
			
		
		ComptePayant cp = new ComptePayant(10);
		cp.setId(lid);
		cp.setNom(leNom);
		cp.setSolde(leSolde);
		
		cp.verser(1000);
		
		System.out.println(cp);
		
		
		System.out.println("----------------------------------------------");
		
		
		System.out.println("----------------Nombres Comptes ---------------");
		System.out.println(Compte.getNbComptes());

	}

}
