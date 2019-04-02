package com.orangehrm.tests;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.pageobjects.HomePage;
import com.orangehrm.pageobjects.LoginPage;
import com.orangehrm.setup.BaseTest;
//import com.orangehrm.utility.CommonMethods;
import com.orangehrm.utility.Log;

public class LoginPageTest extends BaseTest{

	
	LoginPage loginPage;
	HomePage homePage;
	
	
	@Test
	public void loginTest() throws InterruptedException
	{
		loginPage = new LoginPage(driver);
		loginPage.Login();	
		Log.info("Login Successful");
	}
	
/*	@Test()
	public void verifyGenInfoTabTest() throws InterruptedException
	{
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		loginPage.Login();	
		homePage.NavigateToTab(homePage.AdminTab);
		homePage.NavigateToTab(homePage.OrganizationTab);
		homePage.NavigateToTab(homePage.GeneralInformationTab);
		homePage.GeneralInformationTab.click();
		Assert.assertEquals(homePage.GeneralInformationHeader.getText(), "General Information");
		Log.info("Navigated to General Information tab ");		
	}*/

	/*@Test()
	public void verifyFieldsEditable() throws InterruptedException
	{
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		loginPage.Login();	
		homePage.NavigateToTab(homePage.AdminTab);
		homePage.NavigateToTab(homePage.OrganizationTab);
		homePage.NavigateToTab(homePage.GeneralInformationTab);
		homePage.GeneralInformationTab.click();
		Assert.assertEquals(homePage.GeneralInformationHeader.getText(), "General Information");
		Log.info("Navigated to General Information tab ");		
	}*/

}
