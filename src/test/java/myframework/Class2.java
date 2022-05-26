package myframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {
	
	@BeforeTest
	public void beforeTestClass2() {
		System.out.println("beforeTestClass2");
	}
	
	@BeforeMethod
	public void beforeMethodClass2() {
		System.out.println("beforeMethodClass2");
	}
	
	@BeforeClass
	public void beforeClass2() {
		System.out.println("beforeClass2");
	}
	
	@AfterClass
	public void afterClass2() {
		System.out.println("afterClass2");
	}
	
	
	@Test
	public void class2method1() {
		System.out.println("class2method1");
		
	}
	
	@Test
	public void class2method2() {
		System.out.println("class2method2");
	}
	
	@Test	
	public void class2method3() {
		System.out.println("class2method3");
	}
	
	@AfterTest
	public void afterTestClass2() {
		System.out.println("afterTestClass2");
	}
	
	@AfterMethod
	public void afterMethodClass2() {
		System.out.println("afterMethodClass2");
	}


}
