import java.util.Scanner;

public class Lecture {

	static Scanner clavier = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = 0;
		String str1 = "";
		String str2 = "";
		
		System.out.println("Entrer un entier: ");
		n= clavier.nextInt();
		clavier.nextLine();
		
		System.out.println("Entrer du texte: ");
		str1= clavier.nextLine();
		
		System.out.println("Entrer du texte: ");
		str2= clavier.nextLine();
		
		
		System.out.println("n = " + n);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
	}

}
