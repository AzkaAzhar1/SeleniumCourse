package TestNGFramework;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ExcludeTestCase {

	@Test (priority =1)
	public void a() {
		System.out.println("This is a test case");
		
	}
		@Test (priority =2 , enabled = false)  //isy test case exclude hojaye just incase if use case is changed
		public void b() {
			System.out.println("This is a test case b");
			
		}		
			@Ignore // ignore will also make test case exclude 
			@Test (priority =3)
			public void c() {
				System.out.println("This is a test case c");
				
			
	}
}


