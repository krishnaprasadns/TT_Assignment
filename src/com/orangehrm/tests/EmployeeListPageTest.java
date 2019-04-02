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
	
	
	@DataProvider(name="employeeData")
    public Object[][] userFormData() throws Exception
    {
        Object[][] data = testData("C:\\Users\\nkrishna\\Desktop\\Edge\\Automation\\Reflektive\\Tookitaki\\EmployeeData.xlsx", "Employee");
        return data;
    }
     
    public Object[][] testData(String xlFilePath, String sheetName) throws Exception
    {
        Object[][] excelData = null;
        ExcelUtility xl = new ExcelUtility();
        xl.
        int rows = xl.getRowCount(sheetName);
        int columns = xl.getColumnCount(sheetName);
                 
        excelData = new Object[rows-1][columns];
         
        for(int i=1; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                excelData[i-1][j] = eat.getCellData(sheetName, j, i);
            }
             
        }
        return excelData;
    }



}
