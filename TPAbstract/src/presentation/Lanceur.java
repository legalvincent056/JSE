package presentation;

import metier.Rectangle;

import metier.Carre;
import metier.Ellipse;

public class Lanceur {

	public static void main(String[] args) {
		
		
		//Calcul du carre
		Carre c = new Carre(30);	
		System.out.println(c);
		
		System.out.println("----------------------------------------------------------------------");
		
		
		//Calcul du rectangle
		Rectangle r = new Rectangle(2,8);
		System.out.println(r);
	
		
		System.out.println("----------------------------------------------------------------------");
	
		//Calcul de l'ellipse
		Ellipse e = new Ellipse(5,3);
		System.out.println(e);
	
	
	}

	
	
}
