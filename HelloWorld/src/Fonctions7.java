
public class Fonctions7 {

	public static void main(String[] args) {
		System.out.println(factoriel(5));

	}
	
	static int factoriel(int nbre){
		if (nbre <0){
			System.out.println("Le nombre doit etre un entier >0");
			return -1; //je dois retourner un entier donc j'utilise return -1. sinon je retourne une chaine de caractère. cela ne marche pas
			
		}else{
			int res = 1;
			
			for(int i= 1; i<=nbre;i++){ //5*4*3*2*1 si nbre = 5 pour avoir son factoriel 5!
				res = res*i;
			}
			return res;	
		}
	}

}
