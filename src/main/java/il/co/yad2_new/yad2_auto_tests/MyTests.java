package il.co.yad2_new.yad2_auto_tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//import org.junit.Test;

import org.testng.annotations.Test;

public class MyTests {
	@BeforeMethod
	public void setUp() {
		System.out.println("run before method");
	}
	
	@Test
	public void test1() {
		System.out.println("Hello world");

	}

	/*
	 * @Test public void test2() { System.out.println("Hello world"); try { throw
	 * new Exception ("This is an error!"); } catch (Exception e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * 
	 * }
	 */
	@Test
	public void test3() {
	//	int a = 4;
	//	int b = 5;
		int result =7;

		
		 // Assert.assertEquals("Wrong addition result for : " + a + " + " + b, 9,result); 
	  Assert.assertEquals(result >= 7,  "True");
		 

	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	
}
