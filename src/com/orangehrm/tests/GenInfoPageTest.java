package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.pageobjects.GeneralInformationPage;
import com.orangehrm.pageobjects.HomePage;
import com.orangehrm.pageobjects.LoginPage;
import com.orangehrm.setup.BaseTest;
import com.orangehrm.utility.CommonMethods;
import com.orangehrm.utility.Log;

public class GenInfoPageTest extends BaseTest{
	

	HomePage homePage;
	
	LoginPage loginPage;
	GeneralInformationPage genInfo;
	
	
	@Test()
	public void verifyGenInfoFieldsTest()
	{
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		genInfo = new GeneralInformationPage(driver);
		
		loginPage.Login();	
		homePage.NavigateToGenInfoTab();
		genInfo.verifyGenInfoFieldsEditable();
		genInfo.saveOrganization();
		
		
		
		
	}


}
