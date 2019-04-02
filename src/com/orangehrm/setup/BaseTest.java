package com.orangehrm.setup;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.orangehrm.utility.CommonMethods;
import com.orangehrm.utility.Log;
import com.orangehrm.utility.ReadConfigFile;


//import com.cleartrip.utility.ExtentManager;

public class BaseTest {
	public WebDriver driver;
	

	/*@BeforeSuite
	public void reportSetup() throws Exception {
		//extent = ExtentManager.getReporter();
	}*/

	
	@Parameters({"browser","app"})
	
	@BeforeMethod
	public void setup(String browser,String app) throws Exception {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + File.separator
							+ "chromedriver.exe");
			driver = new ChromeDriver();
		     
		} else if (browser.equalsIgnoreCase("FireFox")) {
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setCapability("marionette", false);
		    
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\nkrishna\\Desktop\\Edge\\Automation\\Reflektive\\Reflektive\\geckodriver.exe");
			 
		//System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + File.separator+ "geckodriver.exe");
			driver = new FirefoxDriver(firefoxOptions);
		     
		} else {
			throw new Exception("Please pass the correct browser name !!");
		}
		Log.info("WebDriver instantiated");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Log.info("Maximize browser window");
		//String Url = ReadConfigFile.getPropertyValue("ClearTripURL");
		if(app.equalsIgnoreCase("orangehrm"))
		{
		String Url = ReadConfigFile.getPropertyValue("orangehrmURL");
		driver.get(Url);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		}
		}
	
	@AfterMethod
	public void afterMethod() throws Exception {
		driver.quit();
		Log.info("Browser Closed");
	}

}
