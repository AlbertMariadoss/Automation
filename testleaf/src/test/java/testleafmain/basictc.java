package testleafmain;

import java.io.IOException;

import org.testng.annotations.Test;

import testleaf.Base;

public class basictc extends Base {

	@Test
	public void browserinstall() throws IOException {
		driver = initializedriver();
		driver.get("http://www.leafground.com/");
		

	}

}
