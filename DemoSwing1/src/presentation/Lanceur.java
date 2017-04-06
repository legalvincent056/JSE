package presentation;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fenetre f = new Fenetre("MA FENETRE"); //Il n'y a pas d'importation de la classe Fenetre car Lanceur et Fenetre sont dans le même package
		f.setVisible(true); // affichage de la fenêtre
		

	}

}
