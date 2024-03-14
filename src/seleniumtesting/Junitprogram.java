package seleniumtesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitprogram {
	@Before
	public void Opensite() {
		System.out.println("open the site");
		
		
	}
	@Test
	public void testsite() {
		System.out.println("Test the contents");
		
	}
	@After
	public void closesite() {
		System.out.println("close the site");
		
	}

}
