package org.sample;



import org.testng.annotations.Test;

public class SampleTestng {
	
	
	
	
	@Test(groups= "@jelo")
	private void T1() {
		
		System.out.println("kiwi");
}

    @Test(groups= {"@jelo", "@melo"})
	private void T3() {

		System.out.println("apple");
		
	}
	
	@Test(groups="@melo")
	private void T2() {

	System.out.println("orange");
		
	}
	
	@Test(groups= {"@jelo","@kelo"})
	private void T4() {
      System.out.println("mango");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
