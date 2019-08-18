package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@placeholder='E-mail address']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement submit;
	
	
	public LoginPage() {
	
	PageFactory.initElements(driver, this);

	}
	
  public String LoginPageTitle() {	
	
   return driver.getTitle();
	  
    }
  
  public HomePage Login(String user,String pass) {
	  
	  username.sendKeys(user);
	  password.sendKeys(pass);
	  submit.click();
	  
	 return new HomePage();
	  
      }
  
}