package myframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	
	@BeforeTest
	public void beforeTestClass1() {
		System.out.println("beforeTestClass1");
	}
	
	@BeforeMethod
	public void beforeMethodClass1() {
		System.out.println("beforeMethodClass1");
	}
	
	@BeforeClass
	public void beforeClass1() {
		System.out.println("beforeClass1");
	}
	
	@AfterClass
	public void afterClass1() {
		System.out.println("afterClass1");
	}
	
	
	@Test(groups= {"BAT"})
	public void class1method1() {
		System.out.println("class1method1");
		
	}
	
	@Test
	public void class1method2() {
		System.out.println("class1method2");
	}
	
	@Test	
	public void class1method3() {
		System.out.println("class1method3");
	}
	
	@AfterTest
	public void afterTestClass1() {
		System.out.println("afterTestClass1");
	}
	
	@AfterMethod
	public void afterMethodClass1() {
		System.out.println("afterMethodClass1");
	}


}
