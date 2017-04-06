import java.util.Scanner;

public class Conditions2 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
				
		int a, b, c;
		
		System.out.println("Entrer la valeur de a: ");
		a = clavier.nextInt();
		
		System.out.println("Entrer la valeur de b: ");
		b = clavier.nextInt();
		
		System.out.println("Entrer la valeur de c: ");
		c = clavier.nextInt();
		
		if(a==b){
			if(b==c){
				System.out.println("Les trois valeurs sont toutes égales");
			}else{
				System.out.println("La valeur de b est différente de c");
			}
		}else{
				System.out.println("La valeur de a est differente de b");
			
		}
		
	}

}
