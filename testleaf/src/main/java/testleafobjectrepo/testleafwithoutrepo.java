package testleafobjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testleafwithoutrepo {
	public WebDriver driver;

	public testleafwithoutrepo(WebDriver driver) {
		this.driver = driver;

	}

	By dropdown = By.xpath("//h5[contains(text(),'Drop down')]");

	public WebElement dropdown() {
		return driver.findElement(dropdown);
	}

}
