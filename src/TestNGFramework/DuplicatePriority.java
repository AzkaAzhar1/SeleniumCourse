package TestNGFramework;

import org.testng.annotations.Test;

public class DuplicatePriority {

	@Test (priority =1)
	public void b() {
		System.out.println("This is a test case");
		
	}
		@Test (priority =1)
		public void a() {
			System.out.println("This is a test case a");
			
		}		
		
				
}
