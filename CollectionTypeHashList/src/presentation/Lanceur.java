package presentation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lanceur {
	
	public static void main(String[] args) {
	
		//d�claration
		Set hs = new HashSet();
		
		
		
		//ajout d'�lements
		hs.add("toto");
		hs.add(12);
		hs.add('d');
		hs.add('d');
		hs.add(12.6);		
		
		//parcours
		Iterator it = hs.iterator(); //on utlise Iterator car il n'y a pas de "get" dans Hashset
		
		while(it.hasNext()){
			System.out.println(it.next()); //en r�sultat: il n'y a pas de doublons affich�s. Il n'y a pas d'ordre dans les donn�es.
		}
		
		
		
		
	}
}
