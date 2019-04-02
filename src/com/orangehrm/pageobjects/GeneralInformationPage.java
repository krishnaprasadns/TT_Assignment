package com.orangehrm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.orangehrm.utility.CommonMethods;
import com.orangehrm.utility.Log;

public class GeneralInformationPage {

	WebDriver driver;
	CommonMethods commonMethods;
	LoginPage loginPage;
	HomePage homePage;
	GeneralInformationPage genInfo;
	WebDriverWait wait;
	
	public GeneralInformationPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='organization_name']")
	public WebElement OrgName;
	
	@FindBy(xpath="//span[@id='numOfEmployees']")
	public WebElement NumOfEmployees;
	
	@FindBy(xpath="//input[@value='Edit']")
	WebElement EditBtn;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement SaveBtn;
	
	@FindBy(xpath="//input[@id='organization_phone']")
	WebElement Phone;
	
	@FindBy(xpath="//input[@id='organization_email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='organization_street1']")
	WebElement Street1;
	
	@FindBy(xpath="//input[@id='organization_street2']")
	WebElement Street2;
	
	@FindBy(xpath="//input[@id='organization_city']")
	WebElement City;
	
	@FindBy(xpath="//input[@id='organization_zipCode']")
	WebElement ZipCode;
	
	@FindBy(xpath="//input[@id='organization_province']")
	WebElement State;
	
	@FindBy(xpath="//select[@id='organization_country']")
	WebElement Country;
	
	
	
	@FindBy(xpath="//textarea[@id='organization_note']")
	WebElement Note;
	
	@FindBy(xpath="//input[@id='organization_taxId']")
	WebElement TaxId;
	
	@FindBy(xpath="//input[@id='organization_registraionNumber']")
	WebElement RegistrationNumber;
	
	@FindBy(xpath="//input[@id='organization_fax']")
	WebElement Fax;
	
	
		

	
	
	public void verifyGenInfoFieldsEditable()
	{
		EditBtn.click();
		
		Assert.assertEquals(OrgName.isEnabled(), true, "Org Name field is not editable");
		
		Assert.assertEquals(TaxId.isEnabled(), true, "Tax ID field is not editable");
		
		Assert.assertEquals(RegistrationNumber.isEnabled(), true, "RegistrationNumber field is not editable");
		Assert.assertEquals(Fax.isEnabled(), true, "Fax field is not editable");
		Assert.assertEquals(Email.isEnabled(), true, "Email field is not editable");
		Assert.assertEquals(Phone.isEnabled(), true, "Phone field is not editable");
		
		Assert.assertEquals(Street1.isEnabled(), true, "Street1 field is not editable");
		Assert.assertEquals(Street2.isEnabled(), true, "Street2 field is not editable");
		
		Assert.assertEquals(City.isEnabled(), true, "City field is not editable");
		
		Assert.assertEquals(ZipCode.isEnabled(), true, "ZipCode field is not editable");
		Assert.assertEquals(State.isEnabled(), true, "State field is not editable");
		
		Assert.assertEquals(Country.isEnabled(), true, "Country field is not editable");
		Assert.assertEquals(Note.isEnabled(), true, "Note field is not editable");
		
		Assert.assertEquals(TaxId.isEnabled(), true, "TaxId field is not editable");
		Assert.assertEquals(RegistrationNumber.isEnabled(), true, "RegistrationNumber field is not editable");
		Assert.assertEquals(Fax.isEnabled(), true, "Fax field is not editable");
		Assert.assertEquals(NumOfEmployees.isEnabled(), false, "Number of Employees field is editable");
	    /*
		wait = new WebDriverWait(driver,60);
	    wait.until(ExpectedConditions.visibilityOf(OrgName));
	    OrgName.click();
		OrgName.clear();
		OrgName.sendKeys("Kp");
		Assert.
		NumOfEmployees.clear();
		/*try{
		NumOfEmployees.clear();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			Log.info(e.getMessage());
		}*/
		//Assert.assertEquals(NumOfEmployees.isEnabled(), false, "Number of Employees field is editable");*/		
	}
	
	public void saveOrganization()
	{
		SaveBtn.click();
		Assert.assertEquals(EditBtn.isDisplayed(), true);
	}
	
}
