package Testngluminar;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterannotation {
	@Parameters("a")
	@Test
	public void maintest(String s) {
		System.out.println("this is value-"+s);
	}

}
