package presentation;

import metier.Classe;

public class Lanceur {

	public static void main(String[] args) {
		
		//Classe 1
		System.out.println("-----------Classe 1------------");
		
		Classe<String,Double,Float> c1 = new Classe<>("Classe 1",1.1,6.4F);
		System.out.println(c1);
		
		//Classe 2
		System.out.println("-----------Classe 2------------");
		
		Classe<Float,String,Float> c2 = new Classe<>(4.214F,"Classe2",6544.32F);
		System.out.println(c2);
		
		//Classe 3
		System.out.println("-----------Classe 3------------");
		
		Classe<String,String,Integer> c3 = new Classe<>("Classe 3","Classe 3.1",852);
		System.out.println(c3);
		

	} 

}
