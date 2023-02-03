package org.sample;
import java.util.Date;

import org.basemaven.BaseClass;
import org.pojo.Pojoh;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestA extends BaseClass {
	
	
	@BeforeClass
	private void LB() {

		launchBrowser();
		toMax();
		passUrl("https://www.facebook.com/");
		
	}
	

	
	
	@BeforeMethod
	private void Start() {

		Date d=new Date();
		
		System.out.println(d);
	}
	
	@AfterMethod
	private void End() throws InterruptedException {

		Date d=new Date();
		System.out.println(d);
		
		Thread.sleep(2000);
		
	}

@Test(dataProvider= "call")
private void T1(String user, String pass) {
	
	
	Pojoh p=new Pojoh();
	
	toInputValue(p.getUsername(), user);
	toInputValue(p.getPass(), pass);
	toClick(p.getLog());
}

@DataProvider(name="call")
private String[][] Data() {
	
	return new String[][]{


	{"78994217","Sharat@123"},
	
	{"jjxjj","hsjjsks"},
	{"78663535","shydteeukd"},
	{"7899421788","Sharat@12thr33"}
	
	
	
	
	};
	
	
}









}
