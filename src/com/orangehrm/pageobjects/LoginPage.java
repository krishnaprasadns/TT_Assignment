package com.orangehrm.pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orangehrm.utility.CommonMethods;
import com.orangehrm.utility.ReadConfigFile;


public class LoginPage {

	WebDriver driver;
	CommonMethods commonMethods;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginButton;

	
	@FindBy(id="welcome")
	WebElement welcomeMessage;
	
	
	public void Login()
	{
		String USERNAME = ReadConfigFile.getPropertyValue("USERNAME");
		String PASSWORD = ReadConfigFile.getPropertyValue("PASSWORD");
		String WelcomeMsg = ReadConfigFile.getPropertyValue("AdminWelcomeMessage");
		
		username.sendKeys(USERNAME);
		password.sendKeys(PASSWORD);
		loginButton.click();
		
		System.out.println(welcomeMessage);
		Assert.assertEquals(WelcomeMsg,welcomeMessage.getText());	
	 
	}

}
