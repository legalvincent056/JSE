
public class Fonctions6 {

	public static void main(String[] args) {
		
		System.out.println(racine_carree_double(6));
		//System.out.println(nbre_double);//ne fonctionne pas car la variable est utilisé dans la méthode

	}
	static double racine_carree_double(int nbre){
		int nbre_double = nbre*2;
		return Math.sqrt(nbre_double);
	}

}
