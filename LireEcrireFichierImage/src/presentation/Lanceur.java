package presentation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lanceur {

	public static void main(String[] args) throws IOException , FileNotFoundException {
		

		File f1 = new File("albert.jpg"); //lien entre pointeur et image
		FileInputStream fi = new FileInputStream(f1); //lien entre la méthode et le pointeur
		
		File f2 = new File("albert_copie.jpg"); //lien entre le pointeur la future image
		FileOutputStream fo = new FileOutputStream(f2); // lien entre la méthode et le pointeur
		
		
		int c;
		
		while((c = fi.read()) !=-1){
			
			fo.write(c);
			
		}
		fi.close();
		fo.close();
		
		
		
	}

}
