package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	//public static WebDriver driver;
	
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement contactlable;
	
	@FindBy(xpath="//div[@class='ui fitted read-only checkboxxxxxxxxxxxx']")
	WebElement checkbox;
	
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement NewBtn;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//div[@name='company']")
	WebElement company;
	
	@FindBy(xpath="//input[@placeholder='Street Address']")
	WebElement address;
	
	@FindBy(xpath="//div[@name='country']")
	WebElement country;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
    WebElement save;	
	
	public ContactsPage() {
		
	PageFactory.initElements(driver, this);
	
	System.out.println("driver value is  -------------- " +driver);
		
	}
	
	public Boolean ContactLable()
	{
		
	return contactlable.isDisplayed();	
		
	}	
	
	public void CheckBox() {
		
	checkbox.click();	
	}
	
	public void NewBtn() {
		
	NewBtn.click();	
			
	}
	
	public void NewContactCreation(String firstnm,String lastnm,String adres) {
	
	firstname.sendKeys(firstnm);
	lastname.sendKeys(lastnm);
    address.sendKeys(adres);
	//Select select = new Select(country);
	//select.selectByVisibleText(contry);
	
	}
	
	public void SaveBtn() {
		
		
	save.click();	
		
	}	
	}
	
	
	