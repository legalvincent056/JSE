package presentation;


import metier.Complexe;
import metier.Reel;
import service.ComplexeService;
import service.IComplexeService;
import service.IReelService;
import service.ReelService;

public class Lanceur {

	public static void main(String[] args) {
		
		//déclaration interface Complexe
		IComplexeService cs =  new ComplexeService();
		
		//instanciation des 2 complexes
		Complexe c1 = new Complexe(10.2,15.1);
		Complexe c2 = new Complexe(15.3,12.6);
		
		//Les Complexes
		System.out.println("------------------------------");
		System.out.println("c1 = "+ c1.getRe() +" + i " + c1.getIm());//Affichage des Complexes c1 et c2
		System.out.println("c1 = "+ c2.getRe() +" + i " + c2.getIm());
		System.out.println("-----Addition c1 + c2-----");
		System.out.println(cs.addition(c1, c2));
		System.out.println("-----Soustraction c1 + c2-----");
		System.out.println(cs.soustraction(c1, c2));		
		
		
		//Les réels
		// déclaration interface Reel
		
		IReelService rs = new ReelService();
		
		// instanciations des 2 réels
		Reel r1 = new Reel(3.5);
		Reel r2 = new Reel(5.6);
		
		System.out.println("-------------------------------");
		System.out.println("r1 = "+ r1.getX());
		System.out.println("r2 = "+ r2.getX());
		System.out.println("-----Addition r1 + r2-----");
		System.out.println(rs.addition(r1, r2));
		System.out.println("-----Soustraction r1 + r2-----");
		System.out.println(rs.soustraction(r1, r2));
		
		
		
		
		
	}

}
