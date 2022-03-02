package testleafmain;

import java.io.IOException;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpResponse;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import testleaf.Base;
import testleafobjectrepo.testleafwithoutrepo;
import testleafobjectrepo.testleafwithpagefactoy;

public class basictc extends Base {
	public WebDriver driver;
	public testleafwithpagefactoy wpf;
	public testleafwithoutrepo wopf;

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

	@Test
	public void image() {
		wpf.image().click();
		wpf.homeimage().click();
		driver.navigate().back();
		String homeimg = wpf.homeimage().getAttribute("src");
		System.out.println(homeimg);
		String brokenimg = wpf.brokenimage().getAttribute("src");
		System.out.println(brokenimg);
		WebElement ele = wpf.mouseorkey();
		Actions ACT = new Actions(driver);
		ACT.click(ele).build().perform();// mouse click
		driver.navigate().back();
		ACT.sendKeys(ele, Keys.ENTER).build().perform();// keyboard click

	}

	public void dropdown() {
		wopf = new testleafwithoutrepo(driver);
		wopf.dropdown().click();

	}

}
