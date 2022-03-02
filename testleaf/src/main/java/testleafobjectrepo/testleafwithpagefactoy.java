package testleafobjectrepo;

import java.util.List;

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
	@FindBy(xpath="//*[@id=\"text-2\"]/a/img")
	WebElement testleaflogo;
	@FindBy(id="no")
	WebElement no;
	@FindBy(name="news")
	List<WebElement> isselect;
	@FindBy(xpath="//*[@id=\"post-153\"]/div[2]/div/ul/li[6]/a/h5")
	WebElement radio;
	@FindBy(xpath="//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]")
	WebElement wascheck;

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
	public WebElement testleaflogo() {
		return testleaflogo;
	}
	public WebElement No() {
		return no;
	}
	public List<WebElement> isselect() {
		return isselect;
	}
	public  WebElement radio() {
		return radio;
	}
	public  WebElement wascheck() {
		return wascheck;
	}
}
