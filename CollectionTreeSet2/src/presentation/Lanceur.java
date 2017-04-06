package presentation;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import metier.Personne;

public class Lanceur {

	public static void main(String[] args) {
		
		//1- déclaration de la collection
		SortedSet <Personne> set = new TreeSet<Personne>(
				new Comparator<Personne>() { //fonction interne qui a une methode Compare 

					@Override
					public int compare(Personne o1, Personne o2) { //Tri par ordre alphabétique de Z à A 
						if(o1.getNom().equals(o2.getNom())){
							
							return o2.getPrenom().compareTo(o1.getPrenom());
						}
						else {
							return o2.getNom().compareTo(o1.getNom());
						}
					}
					
				}
				
				
				);

		//2- Création des objets personne
		
		Personne p1 = new Personne(1,"Dupond","Marcel");
		Personne p2 = new Personne(2,"Dupond", "Jean-jacques");
		Personne p3 = new Personne(3,"Poulidor", "Raymond");
		Personne p4 = new Personne(4,"Kervalenec","Yann");
		
		
		//3- ajouter les personnes à la collection
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
			
				
		//4- parcours et afficher la collection
		
		for (Personne p :set){
			System.out.println(p);
		}
	}

}
