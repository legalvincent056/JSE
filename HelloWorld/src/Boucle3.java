import java.util.Scanner;

public class Boucle3 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int age = 0;
		
		do{
			System.out.println("Entrer votre age:");
			age = clavier.nextInt();
			
			if (age <=0){
				System.out.println("L'age doit être positif");
				
			}
			
		}while ( age <=0);

	}

}
