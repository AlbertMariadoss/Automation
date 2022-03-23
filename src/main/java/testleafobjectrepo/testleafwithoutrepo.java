package testleafobjectrepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testleafwithoutrepo {
	public WebDriver driver;

	public testleafwithoutrepo(WebDriver driver) {
		this.driver = driver;

	}

	By dropdown = By.xpath("//h5[contains(text(),'Drop down')]");
	By indexdrop = By.xpath("//*[@id=\"dropdown1\"]");
	By textdrop = By.xpath("//*[@id=\"contentblock\"]/section/div[2]/select");
	By valuedrop = By.xpath("//*[@id=\"dropdown3\"]");
	By numberdrop = By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select");
	By selectdrop = By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select");
	By dropselect = By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[2]");
	By checkboxfirst = By.xpath("//*[@id=\"contentblock\"]/section/div[1]");
	By selectornot = By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input");
	By deselect = By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/input");
	By selectall = By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/*");
	By checkbox = By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[7]/a/h5");

	public WebElement dropdown() {
		return driver.findElement(dropdown);
	}

	public WebElement indexdrop() {
		return driver.findElement(indexdrop);
	}

	public WebElement textdrop() {
		return driver.findElement(textdrop);
	}

	public WebElement numberdrop() {
		return driver.findElement(numberdrop);
	}

	public WebElement selectdrop() {
		return driver.findElement(selectdrop);
	}

	public WebElement dropselect() {
		return driver.findElement(dropselect);
	}

	public WebElement valuedrop() {
		return driver.findElement(valuedrop);
	}

	public List<WebElement> checkboxfirst() {
		return driver.findElements(checkboxfirst);
	}

	public WebElement selectornot() {
		return driver.findElement(selectornot);
	}

	public List<WebElement> deselect() {
		return driver.findElements(deselect);
	}

	public List<WebElement> selectall() {
		return driver.findElements(selectall);
	}

	public WebElement checkbox() {
		return driver.findElement(checkbox);
	}

}
