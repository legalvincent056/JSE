package metier.test;

import org.junit.Assert;
import org.junit.Test;

import metier.Compte;

public class CompteTest {
	
	//Test verser
	@Test
	public void testVerser (){
		
		Compte c = new Compte(123,"testVerser",300);
				
		float testver = c.verser(100);
	
	Assert.assertEquals(true,testver==400);
	}
	
	
	//tester retirer
	@Test
	public void testRetirer(){
		
		Compte c1 = new Compte(456,"testRetier",400);
		
		float testreti =c1.retirer(100);
		
	Assert.assertEquals(testreti,300 ,0);
				
				
		
	}
	

}
