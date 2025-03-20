package TestNGFramework;

import org.testng.annotations.Test;

public class PartialPriority {
	
	@Test (priority =1)
	public void a() {
		System.out.println("This is a test case");
		
	}
		@Test (priority =2)
		public void b() {
			System.out.println("This is a test case b");
			
		}		
			@Test //0 default priority is zero so it will run first
			public void c() {
				System.out.println("This is a test case c");
			}
				
				@Test //0 default priority is zero
				public void d() {
					System.out.println("This is a test case d");
				
				
			}

}
