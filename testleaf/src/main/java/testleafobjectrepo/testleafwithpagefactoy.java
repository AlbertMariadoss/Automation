package testleafobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testleafwithpagefactoy {

	public  WebDriver driver;

	public testleafwithpagefactoy(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/h5")
	WebElement hyberlink;
	@FindBy(xpath = "//*[@id=\"contentblock\"]/section/div[1]/div/div/a")
	WebElement clickme;

	public WebElement hyberlink() {
		return hyberlink;
	}

	public WebElement clickme() {
		return clickme;
	}

}
