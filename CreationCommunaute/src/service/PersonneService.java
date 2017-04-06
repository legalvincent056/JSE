package service;

import metier.Personne;

public class PersonneService {

	public void marcher (Personne p){
		
		System.out.println(p.getNom() + " marche");
	}
	
	public void arreter (Personne p){
		
		System.out.println(p.getNom() + " s'arrête");
	}
	
	
	public String pause (Personne p){
		
		return p.getPrenom() + " fait une pause";
	}
	
}
