package testleafobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testleafwithpagefactoy {

	public WebDriver driver;

	public testleafwithpagefactoy(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/h5")
	WebElement hyberlink;
	@FindBy(xpath = "//*[@id=\"contentblock\"]/section/div[1]/div/div/a")
	WebElement clickme;
	@FindBy(xpath = "//a[contains(text(),'Find where am supposed to go without clicking me?')]")
	WebElement withoutclick;
	@FindBy(xpath = "//a[contains(text(),'Verify am I broken?')]")
	WebElement broken;
	@FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[4]/div[1]/div[1]/a[1]")
	WebElement home;
	@FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement homeimage;
	@FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[2]/div[1]/div[1]/img[1]")
	WebElement brokenimage;
	@FindBy(xpath = "//h5[contains(text(),'Image')]")
	WebElement image;
	@FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[3]/div[1]/div[1]/img[1]")
	WebElement mouseorkey;

	public WebElement hyberlink() {
		return hyberlink;
	}

	public WebElement clickme() {
		return clickme;
	}

	public WebElement withoutclick() {
		return withoutclick;
	}

	public WebElement broken() {
		return broken;
	}

	public WebElement home() {
		return home;
	}

	public WebElement homeimage() {
		return homeimage;
	}

	public WebElement brokenimage() {
		return brokenimage;
	}

	public WebElement image() {
		return image;
	}

	public WebElement mouseorkey() {
		return mouseorkey;
	}

}
