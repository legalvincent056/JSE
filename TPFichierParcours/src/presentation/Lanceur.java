package presentation;

import java.io.File;

public class Lanceur {

	public static void main(String[] args) {
		
		String rep = "c:/intel/logs/";
		
		File f = new File(rep); // je pointe sur le repertoire c:

		if(f.exists()){
			
			
			System.out.println(rep + " existe");
			String [] contenu = f.list(); //tout ce qu'il y a dans le fichier, je le mets dans contenu (String [] est un tableau)
			
			for (int i = 0; i<contenu.length;i++){
				
				File f2 = new File(rep,contenu[i]); //Crée un objet f2 pour chaque contenu de c: On utilise File(parent, enfant);
				
				if (f2.isDirectory()){ //Test si c'est un dossier (vrai) sinon c'est un fichier, et je donne la taille
					System.out.println("Repertoire : " + contenu [i]);
				}
				else {
					System.out.println("Fichier : " + contenu [i] + " | Taille : " + f2.length() + " bytes"); 
				}
			}
			
			
		}else{
			System.out.println(rep + " n'existe pas");
		}
		
		
	}

}
