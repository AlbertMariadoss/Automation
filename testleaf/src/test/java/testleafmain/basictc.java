package testleafmain;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testleaf.Base;
import testleafobjectrepo.testleafwithpagefactoy;

public class basictc extends Base {
	public static WebDriver driver;

	 testleafwithpagefactoy wpf = new testleafwithpagefactoy(driver);

	@Test
	public void browserinstall() throws IOException {
		driver = initializedriver();

		driver.get(baseurl);
		driver.manage().window().maximize();

	}

	@Test
	public void hyberlink() {
		wpf.hyberlink().click();
		wpf.clickme().click();

	}

}
