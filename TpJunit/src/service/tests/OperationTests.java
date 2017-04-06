package service.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import service.Operations;

public class OperationTests {

	//test addition
	@Test
	public void testAdd() {
		long resultat = Operations.add(10,20,30);
		Assert.assertEquals(resultat,0);
	}

	@Test
	public void testAdd2 () {
		long resultat = Operations.add(100,20,30);
		Assert.assertEquals(resultat,100+20+30);
	}
	
	//test multiplication
	@Test
	public void testMult() {
		long resultat = Operations.mult(10,20,30);
		Assert.assertEquals(resultat, 10);
	}

	
	@Test
	public void testMult2() {
		long resultat = Operations.mult(100,20);
		Assert.assertEquals(resultat, 100*20);
	}
	
	
	@Before
	public void testbef(){
		System.out.println("--------Test avant chaque test-----------");
		
	}
	
	@After
	public void testaft(){
		System.out.println("-------------Test après chaque test-------");
		
		
	}
	
	@BeforeClass
	public static  void Testbefclass(){
		System.out.println("xxxxxxxxxx----Test début classe-----xxxxxxxx");
		
	}
	
	@AfterClass
	public static  void Testaftclass(){
		
	System.out.println("xxxxxxxx------ Test après classe ------xxxxxxx");
	}
	
	
	
}
