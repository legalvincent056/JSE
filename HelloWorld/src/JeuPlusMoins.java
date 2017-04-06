import java.util.Scanner;

public class JeuPlusMoins {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int chiffre;
		int a;
		
		chiffre = (int)(Math.random() *999)+1; //Nbre entre 1 et 1000
		
		do{
			System.out.println("Entrer un nombre (1- 1000): ");
			a = clavier.nextInt();
			
			if (a== chiffre){
				System.out.println("Felicitation !!!!");
			} else if( a > chiffre){
				System.out.println("Votre nombre est trop grand.");
			} else{
				System.out.println("Votre nombre est trop petit.");
			}
			
		}while (a != chiffre);
		

	}

}
