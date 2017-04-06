
public class fonctions8 {

	public static void main(String[] args) {
		
		System.out.println(factoriel(5));
		

	}
	static int factoriel(int n){
		if(n==0 ||n==1){
			return 1;
		} else
			return n * factoriel(n-1);
	}
	
	//5* factoriel(4)		5*24 =120
		//4* factoriel(3)		4*6
			//3*factoriel(2)		3*2
				//2*factoriel(1)		2*1
					//	1					1

}
