package testleaf;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	public String baseurl;

	public WebDriver initializedriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\ALBERT\\Documents\\Zoom\\Automation\\testleaf\\src\\main\\java\\testleaf\\data.properties");
		// FileInputStream fis = new
		// FileInputStream("/home/netxd/Downloads/Automation/testleaf/src/main/java/testleaf/data.properties");
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
	
	public void getScreenShotPath(String testCaseName,WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationfile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationfile));
		
	}
}
