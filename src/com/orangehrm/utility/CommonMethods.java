package com.orangehrm.utility;

//import java.io.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
/*
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;*/
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	WebDriver driver;
	WebDriverWait wait;
	
	public CommonMethods(WebDriver driver){
		this.driver = driver;
	//	PageFactory.initElements(driver, this);
	}
	
	public void Click(WebElement Element)
	{
		Element.click();
	}
	
	public static void selectDropdownValue(WebElement Element,String value)
	{
		Select dropdown = new Select(Element);
		dropdown.selectByValue(value);
	}
	public static void selectDropdownByVisibleText(WebElement Element,String Text)
	{
		Select dropdown = new Select(Element);
		dropdown.selectByVisibleText(Text);
	}
	
	public void waitForElementToBeVisible(WebDriver driver,WebElement locator) {
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(locator));
	}
	}	












