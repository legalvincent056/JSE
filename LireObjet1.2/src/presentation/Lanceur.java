package presentation;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import metier.Compte;

public class Lanceur {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		/**
		 * Partie Traitement de STREAM
		 */
		
		
		File f = new File("banque.txt"); //lien (D) sur le schéma
		FileInputStream fis = new FileInputStream(f); //lien (E) sur le schéma
		ObjectInputStream ois = new ObjectInputStream (fis); //lien (F) sur le schema
		
		
		Compte c;
		
		try {
			while((c = (Compte) ois.readObject()) != null){
				
				
				System.out.println(c);
				
				
			}
		} catch (EOFException e) {
			System.out.println("Fin programme");
		}
		fis.close();
		ois.close();
		
	
	}
}


