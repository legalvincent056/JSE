package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lanceur {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		/**
		 * En partie Communication de STREAM
		 */
		File f1 = new File ("fichier1.txt");		 //on pointe vers le fichier texte (1)sur le sch�ma
		FileReader fr = new FileReader(f1);		 // on fait le lien entre la m�thode et le pointeur (2) sur le sch�ma
		
		
		File f2 = new File("fichier2.txt"); 		//on pointe vers le fichier texte (3) sur le sch�ma
		FileWriter fw = new FileWriter(f2); 		//lien entre la m�thode et le pointeur (4) sur le sch�ma
		
		//boucle de cryptage
		int c;
		
		while((c=fr.read())!=-1){ 		//tant que je ne suis pas arriv� � la fin de mon fichier. Et on assigne directement c � la donn�e
		
			fw.write(c+1);		 //j'�cris mes donn�es de c
									// je cripte en d�calant de +1 mon c
		}
		fr.close();		 //je ferme les communications aux fichiers
		fw.close();		 //il faut fermer les communications si l'on veut �crire sur le fichier2.txt
		
		
		
		
		
		
								//je cr�e un fichier 3 qui d�cripte le fichier 2
					
		File f3 = new File("fichier2.txt"); 	//je cr�e le lien avec mon fichier2.txt
		FileReader fr2 = new FileReader(f3);	 //je fais le lien entre ma m�thode et mon pointeur
		
		File f4 = new File("fichier3.txt");		 //je cr�e un fichier3.txt avec mon pointeur
		FileWriter fw2 = new FileWriter(f4); 	//je cr�e un lien entre ma m�thode et mon pointeur
		
		//boucle de d�cryptage
		int a;
		while((a=fr2.read())!=-1){		 //tant que je ne suis pas arriv� � la fin de mon fichier. Et on assigne directement c � la donn�e
			
			fw2.write(a-1); 		//j'�cris mes donn�es de c
		
		}
		
		fr2.close(); 			//je ferme les communications
		fw2.close();
		
		
	}
	
	
	
	
}
