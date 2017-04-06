package presentation;

import java.util.Scanner;

import metier.Employe;

public class Lanceur {

	public static void main(String[] args) {
		
		Employe e = new Employe();
		
		
		//valorisation 1er employé
		e.setNom("Roger");
		e.setPrenom("Roro");
		e.setId(123456789);	
		
		//affichage 1er employé
		System.out.println("nom = " + e.getNom() + "\nprenom = " + e.getPrenom() + "\nid = " + e.getId());
		
		System.out.println("--------------------------------------------");
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Entrer le nom =");
		String leNom = clavier.next();
		
		System.out.println("Entrer le prenom =");
		String lePrenom = clavier.next();
		
		System.out.println("Entrer l'ID =");
		Long lId = clavier.nextLong();
		
		
		Employe e1 = new Employe(leNom,lePrenom,lId);
		
		System.out.println(e1);
		
		clavier.close();

	}

}
