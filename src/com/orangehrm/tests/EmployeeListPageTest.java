package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.*;
import com.orangehrm.pageobjects.EmployeeListPage;
//import com.orangehrm.pageobjects.ExcelApiTest;
import com.orangehrm.pageobjects.GeneralInformationPage;
import com.orangehrm.pageobjects.HomePage;
import com.orangehrm.pageobjects.LoginPage;
import com.orangehrm.setup.BaseTest;
import com.orangehrm.utility.CommonMethods;
import com.orangehrm.utility.ExcelUtility;
import com.orangehrm.utility.Log;

public class EmployeeListPageTest extends BaseTest{
	

	HomePage homePage;
	
	LoginPage loginPage;
    EmployeeListPage empListPage;
	
	
	@Test()
	public void verifyAddEmployeeTest()
	{
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		empListPage = new EmployeeListPage(driver);
		
		loginPage.Login();	
		homePage.NavigateToEmployeeListTab();
		empListPage.addEmployee();
		
		
		
	}
	
	
	



}
