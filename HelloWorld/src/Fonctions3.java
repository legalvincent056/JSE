import java.util.Scanner;

public class Fonctions3 {
	
	private static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		
		direBonjour();
		direBonjour();
		

	}
	
	static void direBonjour(){
		String nom;
		System.out.println("Entrer votre nom: ");
		
		nom = clavier.nextLine();
		
		System.out.printf("Bonjour %s\n", nom);
		
	}

}
