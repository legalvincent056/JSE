package presentation;

import java.util.Scanner;

import metier.Compte;
import service.ServiceCompte;

public class Lanceur {

	public static void main(String[] args) {
		
		//Création d'un objet
		Compte com = new Compte(0,"compte1",0);
		
		ServiceCompte sc = new ServiceCompte();
		
		
		System.out.println("Le solde actuelle du compte "+ com.getNomCompte()+ ", n°" + com.getIdCompte() + " est de :" + com.getSolde());
		
			
		Scanner clavier = new Scanner(System.in);
		
		//données de base saisie par le client
		System.out.println("Quel est le n° de compte :");
		int leNum =clavier.nextInt();
		com.setIdCompte(leNum);
		
		System.out.println("Quel est le nom du compte :");
		String nomCompte =clavier.next();
		com.setNomCompte(nomCompte);
		
		System.out.println("Quel est le montant du solde :");
		Long leSolde = clavier.nextLong();
		com.setSolde(leSolde);
		
		System.out.println(com);
		
		
		//ajouter un montant au solde
		System.out.println("Entrer le montant à créditer: ");
		Long leMontant = clavier.nextLong();
		sc.ajouter(com, leMontant);
		
		System.out.println(com);
		
		
		
		//soustraire un montant au solde
		System.out.println("Entrer le montant à débiter: ");
		Long ledebit = clavier.nextLong();
		sc.soustraire(com, ledebit);
		
		System.out.println(com);
		
	
		clavier.close();
	}
}
