
public class Fonctions5 {

	public static void main(String[] args) {
		methode2(); // 2 (le return 2 n'est pas demand� d'�tre affich�) donc la m�thode1 affiche
		//System.out.print(methode2());
		

	}

	static void methode1(){
		System.out.println("Je suis la m�thode 1");
	}
	
	static int methode2(){
		methode1();
		return 2;
	}
	
}
