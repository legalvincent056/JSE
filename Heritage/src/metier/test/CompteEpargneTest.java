package metier.test;

import org.junit.Assert;
import org.junit.Test;

import metier.CompteEpargne;

public class CompteEpargneTest {
	
	//Test de la méthode Calcul Intéret
	
	@Test
	public void TestInteret (){
		
		CompteEpargne ce = new CompteEpargne(789,"test Interet",1000 , 0.20f);
		
		float testInt = ce.calculInteret();
		
		Assert.assertEquals(testInt,200,0);
		
		
	}
	
	
	
	

}
