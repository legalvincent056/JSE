package presentation;

import java.util.ArrayList;
import java.util.List;

public class Lanceur {

	public static void main(String[] args) {
		
		//List<String> a1 = new ArrayList<String>();
		
		// déclaration 
		List a1 = new ArrayList();
		
		//ajout
		a1.add(12);
		a1.add("Hello");
		a1.add(12f);
		a1.add(true);
		a1.add(65.32);
		a1.add(12);
	
		//parcours
		for(int i= 0; i < a1.size(); i++){
			
			System.out.println("donnée à l'indice " + i + " = " + a1.get(i));
		}
	
	
	
	
	
	
	
	}
	

}
