package metier.test;

import org.junit.Assert;
import org.junit.Test;

import metier.CompteSimple;

public class CompteSimpleTest {

	//Test Compte Simple avec d�couvert authoris�
	@Test
	public void testRetirer (){
		
		CompteSimple cs = new CompteSimple(123,"testRetirer",300,100);
				
		float testret = cs.retirer(400);
	
	Assert.assertEquals(testret,-100,0);
	}
	
}
