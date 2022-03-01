package testleaf;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	public String baseurl;
	
	//C:\Program Files\Java\jdk-17.0.1
	
	//C:\Users\ALBERT\Desktop\eclipse\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_16.0.2.v20210721-1149\jre

	public WebDriver initializedriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C://Users//ALBERT//git//Automation//testleaf//src//main//java//testleaf//data.properties");
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
