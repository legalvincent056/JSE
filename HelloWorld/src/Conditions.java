import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		Scanner clavier = new Scanner (System.in);
			
		int nbre = 0;
		System.out.println("Entrer un nombre svp: ");
		nbre = clavier.nextInt();
		
		if(nbre >0){
			System.out.println("Le nombre entr� est positif");
		} else if(nbre*nbre == 25){
			System.out.println("Le nombre entr� est -5");
		} else {
			System.out.println("Le nombre entr� est n�gatif et diff�rent de -5");
		}
		
	}

}
