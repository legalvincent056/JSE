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
					public int compare(Personne o1, Personne o2) { //pour un tri en ordre alphabetique de A à Z
						if( o1.getId() == o2.getId()){
							
							return o1.getNom().compareTo(o2.getNom());
						}
						else {
							return ((Integer)o1.getId()).compareTo(o2.getId());
						}
					}
					
				}
				
				
				);

		//2- Création des objets personne
		
		Personne p1 = new Personne(1,"Dupond","Marcel");
		Personne p2 = new Personne(10,"Dupond", "Jean-jacques");
		Personne p3 = new Personne(8,"Poulidor", "Raymond");
		Personne p4 = new Personne(7,"Kervalenec","Yann");
		
		
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
