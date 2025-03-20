package TestNGFramework;

import org.testng.annotations.Test;

public class NegativePriority {

	
	@Test (priority =1)
	public void a() {
		System.out.println("This is a test case");
		
	}
		@Test (priority =-2)
		public void b() {
			System.out.println("This is a test case b");
			
		}		
			@Test (priority =-3)
			public void c() {
				System.out.println("This is a test case c");
				
			
	}
}
