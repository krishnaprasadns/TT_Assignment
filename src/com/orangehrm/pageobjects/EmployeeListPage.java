package com.orangehrm.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.orangehrm.utility.CommonMethods;
import com.orangehrm.utility.Log;

public class EmployeeListPage {
	

	WebDriver driver;
	CommonMethods commonMethods;
	LoginPage loginPage;
	HomePage homePage;
	GeneralInformationPage genInfo;
	WebDriverWait wait;
	
	public EmployeeListPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='Add']")
	public WebElement AddBtn;
	
	@FindBy(xpath="//input[@id='firstName']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@id='middleName']")
	public WebElement middleName;
	
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@id='employeeId']")
	public WebElement employeeId;
	
	@FindBy(xpath="//input[@id='photofile']")
	public WebElement chooseFile;
	
	
	@FindBy(xpath="//input[@value='Save']")
	public WebElement saveEmployee;
	
	@FindBy(xpath="//h1[text()='Personal Details']")
	public WebElement personalDetailsHeader;
	
	
	
	
	
	public void addEmployee()
	{
		AddBtn.click();
		firstName.sendKeys("aa");
		lastName.sendKeys("dd");
		employeeId.click();
		employeeId.clear();
		employeeId.sendKeys("221233");
		
		chooseFile.click();
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String filePath="C:\\Users\\nkrishna\\Desktop\\abc1.jpg";
		uploadImage(filePath);
		
		saveEmployee.click();
		Assert.assertEquals(personalDetailsHeader.isDisplayed(), true);
	}
	
	public void uploadImage(String imagePath)
	{

		 StringSelection stringSelection = new StringSelection(imagePath);
	        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	        clipboard.setContents(stringSelection, null);
	        Robot robot = null;
	        try {
	            robot = new Robot();
	        } catch (AWTException e) {
	            e.printStackTrace();
	        }
	        robot.delay(250);
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.delay(150);
	        Log.info("Image uploaded successfully");
	}
	
}
