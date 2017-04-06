import java.util.Scanner;

public class Fonctions2 {
	
	private static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(doubleFunc(3));
		System.out.println(doubleFunc(9));
		System.out.println(doubleFunc(2));
		System.out.println(doubleFunc(18));
		
		int a = doubleFunc(13); //13: argument
		System.out.println((a-3)+5);

	}
	static int doubleFunc(int nbre){ //nbre: paramètre
		return nbre * 2;
	}
}
