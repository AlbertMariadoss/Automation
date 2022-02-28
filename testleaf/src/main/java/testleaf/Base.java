package testleaf;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	public String baseurl;

	public WebDriver initializedriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C://Users//ALBERT//git//Automation//testleaf//src//main//java//testleaf//data.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		baseurl = prop.getProperty("url");
		if (browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {

		} else if (browsername.equals("IE")) {

		}

		return driver;

	}

}
