package service;

public class Operations {

	
	public static long add(long...numbers) //tableau de nombre- autre manière d'écrire un tableau
	{
		
		if (numbers.length>0){ //taille du tableau
			long resultat = 0;
			
			for(long n : numbers) //n = à la valeur dans la case du tableau
			{
				resultat +=n;
			}
			return resultat;
		}
		else{
			return 0;
		}			
		
	}
	
	
	
	
	public static long mult(long...numbers){
		
		if(numbers.length>0)
		{
			long resultat = 1 ;
				
			for(long n : numbers){
				resultat *= n;
			}
			return resultat;
		}
		else
		{
			return 0;
		}		
	}
	
	
}
