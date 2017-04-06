package metier.test;

import org.junit.Test;


import metier.ComptePayant;
import org.junit.Assert;

public class ComptePayantTest {
	
	@Test
	public void TestPourcentage(){
		
		ComptePayant cp = new ComptePayant(159, "Test Pourcentage", 100, 5f);
		
		float TestPour = cp.retirer(10);
		
		
		Assert.assertEquals(TestPour, 89.5 ,0);
		
		
	}
	

}
