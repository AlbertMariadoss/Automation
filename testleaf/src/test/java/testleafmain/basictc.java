package testleafmain;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testleaf.Base;
import testleafobjectrepo.testleafwithoutrepo;
import testleafobjectrepo.testleafwithpagefactoy;

public class basictc extends Base {
	public WebDriver driver;
	public testleafwithpagefactoy wpf;
	public testleafwithoutrepo wopf;
	public Actions ACT;

	@Test
	public void browserinstall() throws IOException {
		driver = initializedriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		ACT = new Actions(driver);
		ACT.click(ele).build().perform();// mouse click
		driver.navigate().back();
		ACT.sendKeys(ele, Keys.ENTER).build().perform();// keyboard click

	}

	@Test(priority = 4)
	public void dropdown() {
		wopf = new testleafwithoutrepo(driver);
		wopf.dropdown().click();
		Select slt = new Select(wopf.indexdrop());
		slt.selectByIndex(2);
		Select slt1 = new Select(wopf.textdrop());
		slt1.selectByVisibleText("Loadrunner");
		Select slt2 = new Select(wopf.valuedrop());
		slt2.selectByValue("3");
		Select slt3 = new Select(wopf.numberdrop());
		List<WebElement> numb = slt3.getOptions();
		System.out.println(numb.size());
		wopf.selectdrop().sendKeys("Appium");
		wopf.dropselect().click();
		wpf.testleaflogo().click();
	}

	@Test(priority = 5)
	public void radiobutton() {
		wpf.radio().click();
		wpf.No().click();
		List<WebElement> issele = wpf.isselect();
		for (WebElement isseleqa : issele) {
			if (isseleqa.isSelected()) {
				System.out.println("default" + isseleqa.getDomProperty("checked"));
			}
		}
		wpf.wascheck().click();
		wpf.testleaflogo().click();
	}

	@Test(priority = 6)
	public void checkbox() {
		wopf.checkbox().click();
		List<WebElement> check = wopf.checkboxfirst();
		for (WebElement co : check) {
			System.out.println(co);
		}
		System.out.println(wopf.selectornot().isSelected());

		for (WebElement cp : wopf.deselect()) {
			if (!cp.isSelected()) {
				cp.click();
			}

		}
		for (WebElement allsho : wopf.selectall()) {
			allsho.click();

		}
		driver.navigate().back();
	}

	@Test(priority = 7)
	public void table() {
		wpf.table().click();
		System.out.println(wpf.coloumcount().size());
		System.out.println(wpf.rowcount().size());
		for (WebElement counts:wpf.rowcount()) {
			counts.getText();
			
		}

	}

}
