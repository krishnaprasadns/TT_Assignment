package com.orangehrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.orangehrm.utility.*;

public class HomePage {
	

	WebDriver driver;
	CommonMethods commonMethods;
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']")
	public WebElement AdminTab;
	
	@FindBy(xpath="//a[@id='menu_pim_viewPimModule']")
	public WebElement PIMTab;
	

	@FindBy(xpath="//a[@id='menu_dashboard_index']")
	public WebElement DashboardTab;
	
	@FindBy(xpath="//div[@id='div_graph_display_emp_distribution']")
	public WebElement EmployeeDistributionBySubunit;
	
	
	@FindBy(xpath="//a[@id='menu_admin_Organization']")
	public WebElement OrganizationTab;
	
	@FindBy(xpath="//a[@id='menu_pim_viewEmployeeList']")
	public WebElement EmployeeListTab;
	
	
	
	@FindBy(xpath="//a[@id='menu_admin_viewOrganizationGeneralInformation']")
	public WebElement GeneralInformationTab;
	
	@FindBy(id="genInfoHeading")
	public WebElement GeneralInformationHeader;
	
	public void NavigateToTab(WebElement TabName) 
	{
		//commonMethods.waitForElementToBeVisible(driver,TabName);
		Actions a = new Actions(driver);
		a.moveToElement(TabName).build().perform();
		
	}
	
	public void MouseHoverElement(WebElement Element) 
	{
		//commonMethods.waitForElementToBeVisible(driver,TabName);
		Actions a = new Actions(driver);
		a.moveToElement(Element).build().perform();
		
	}
	
	public void NavigateToGenInfoTab()
	{
		NavigateToTab(AdminTab);
		NavigateToTab(OrganizationTab);
		NavigateToTab(GeneralInformationTab);
		GeneralInformationTab.click();
	}
	
	public void NavigateToEmployeeListTab()
	{
		NavigateToTab(PIMTab);
		NavigateToTab(EmployeeListTab);
		EmployeeListTab.click();
	}
	
	public void NavigateToDashboardTab()
	{
		NavigateToTab(DashboardTab);
		DashboardTab.click();
	}
	
	public void HoverEmployeeDistributionBySubUnit()
	{
		
	}
	
	
	
	

	

}
