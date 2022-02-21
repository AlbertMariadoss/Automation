package testleaf;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;

	@SuppressWarnings("deprecation")
	public WebDriver initializedriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C://Users//ALBERT//git//Automation//testleaf//src//main//java//testleaf//data.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ALBERT\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.1.2\\selenium-chrome-driver-4.1.2.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {

		} else if (browsername.equals("IE")) {

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}

}
