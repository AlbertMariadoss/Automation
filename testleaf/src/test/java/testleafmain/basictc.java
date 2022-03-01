package testleafmain;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testleaf.Base;
import testleafobjectrepo.testleafwithpagefactoy;

public class basictc extends Base {
	public WebDriver driver;
	public testleafwithpagefactoy wpf;

	@Test
	public void browserinstall() throws IOException {
		driver = initializedriver();
		driver.get(baseurl);
		driver.manage().window().maximize();

	}

	@Test
	public void hyberlink() {
		wpf = new testleafwithpagefactoy(driver);
		wpf.hyberlink().click();
		wpf.clickme().click();
		driver.navigate().back();
		String link = wpf.withoutclick().getAttribute("href");
		System.out.println("withoutclick" + link);
		String broken = wpf.broken().getAttribute("href");
		System.out.println("Broken url" + broken);
		wpf.home().click();

	}

}
