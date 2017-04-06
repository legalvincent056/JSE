package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import metier.Compte;

public class Lanceur {

	public static void main(String[] args) throws IOException, FileNotFoundException  {
		
		/**
		 * Partie Traitement de STREAM
		 */
		
		Compte c1 = new Compte();
		c1.setIdCompte(1);
		c1.setNomCompte("Compte 1");
		c1.setSolde(200);
		
		
		Compte c2 = new Compte();
		c2.setIdCompte(2);
		c2.setNomCompte("Compte 2");
		c2.setSolde(400);
		
		
		
		File f = new File("banque.txt"); // lien (A) sur le schéma
		FileOutputStream fos = new FileOutputStream(f); // lien (B) sur le schéma
		ObjectOutputStream oos = new ObjectOutputStream (fos); // lien (C) sur le schéma
		
		oos.writeObject(c1);
		oos.writeObject(c2);
		
		oos.close();
		fos.close();
		
		
		

	}

}
