
public class Tableau2 {

	public static void main(String[] args) {
		
		int [] tab1 = new int[3];
		int [] tab2 = new int[3];
		
		tab1[0] = 5;
		tab1[1] = 6;
		tab1[2] = 3;
		
		/*for(int i = 0 ; i < tab1.length; i++){
			System.out.println("tab1 " + i + " = " + tab1[i]);
		}*/
		
		tab2 = tab1;
		
		tab1[0] = 3;
		
		for(int i = 0 ; i < tab1.length; i++){
			System.out.println("tab1 " + i + " = " + tab1[i]);
		}
		
		
		for(int i = 0 ; i < tab2.length; i++){
			System.out.println("tab2 " + i + " = " + tab2[i]);
		}

	}

}
